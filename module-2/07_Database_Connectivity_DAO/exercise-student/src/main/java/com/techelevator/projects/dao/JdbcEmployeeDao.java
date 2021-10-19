package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Project;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date " +
				"FROM employee;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date " +
				"FROM employee " +
				"WHERE first_name ILIKE '%' || ? || '%' AND last_name ILIKE '%' || ? || '%';";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, firstNameSearch, lastNameSearch);
		while (results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date " +
				"FROM employee " +
				"JOIN project_employee USING(employee_id) " +
				"WHERE project_id = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		while(results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
		String sql = "UPDATE project_employee " +
				"SET project_id = ?, employee_id = ? " +
				"WHERE employee_id = ?;";
		jdbcTemplate.update(sql, projectId, employeeId, employeeId);

	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
		String sql = "DELETE FROM project_employee " +
				"WHERE project_id = ? AND employee_id = ?;";
		jdbcTemplate.update(sql, projectId, employeeId);
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT e.employee_id, e.department_id, e.first_name, e.last_name, e.birth_date, e.hire_date " +
				"FROM employee e " +
				"LEFT JOIN project_employee pe USING(employee_id) " +
				"WHERE project_id IS null;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()) {
			employees.add(mapRowToEmployee(results));
		}
		return employees;
	}

	private Employee mapRowToEmployee(SqlRowSet rowSet) {
		Employee employee = new Employee();
		employee.setId(rowSet.getLong("employee_id"));
		employee.setDepartmentId(rowSet.getLong("department_id"));
		employee.setFirstName(rowSet.getString("first_name"));
		employee.setLastName(rowSet.getString("last_name"));
		if(rowSet.getDate("birth_date") != null) {
			employee.setBirthDate(rowSet.getDate("birth_date").toLocalDate());
		}
		if(rowSet.getDate("hire_date") != null){
			employee.setHireDate(rowSet.getDate("hire_date").toLocalDate());
		}
		return employee;
	}
}
