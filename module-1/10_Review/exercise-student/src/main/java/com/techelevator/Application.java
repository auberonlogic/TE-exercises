package com.techelevator;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    /**
     * The main entry point in the application
     * @param args
     */

    private List<Department> departments = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private Map<String,Project> projects = new HashMap<>();

    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!

        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        Department marketing = new Department(1, "Marketing");
        Department sales = new Department(2, "Sales");
        Department engineering = new Department(3, "Engineering");

        departments.add(marketing);
        departments.add(sales);
        departments.add(engineering);
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for (Department department : departments) {
            System.out.println(department.getName());
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {

        LocalDate today = LocalDate.now();

        Employee dean = new Employee(1, "Dean", "Johnson", "djohnson@teams.com", getDepartmentByName("Engineering"), today);
        Employee angie = new Employee(2, "Angie", "Smith", "asmith@teams.com", getDepartmentByName("Engineering"), today);
        Employee margaret = new Employee(3, "Margaret", "Thompson", "mthompson@teams.com", getDepartmentByName("Marketing"), today);

        employees.add(dean);
        employees.add(angie);
        employees.add(margaret);
    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        employees.get(1).raiseSalary(10);
        for (Employee employee : employees) {
            System.out.println(employee.getFullName() + " (" + currency.format(employee.getSalary()) + ") " + employee.getDepartment().getName());
        }
    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() {

        Project teams = new Project("TEams", "Project Management Software", LocalDate.now(), LocalDate.now().plusDays(30));
        for (Employee employee : employees) {
            if (employee.getDepartment().getName().equals("Engineering")) {
                teams.setTeamMembers(employee);
            }
        }
        projects.put("TEams", teams);
    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project marketingLandingPage = new Project("Marketing Landing Page", "Lead Capture Landing Page for Marketing", LocalDate.now().plusDays(31), LocalDate.now().plusDays(38));
        for (Employee employee : employees) {
            if (employee.getDepartment().getName().equals("Marketing")) {
                marketingLandingPage.setTeamMembers(employee);
            }
        }
        projects.put("Marketing Landing Page", marketingLandingPage);
    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        for (String key : projects.keySet()) {
            System.out.println(projects.get(key).getName() + ": " + projects.get(key).getTeamMembers().size());
        }
    }

    private Department getDepartmentByName(String departmentName) {
        for (Department department : departments) {
            if (department.getName().equalsIgnoreCase(departmentName)) {
                return department;
            }
        }
        return null;
    }

}
