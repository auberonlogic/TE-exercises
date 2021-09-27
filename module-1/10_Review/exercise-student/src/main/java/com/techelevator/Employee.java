package com.techelevator;

public class Employee {

    // Instance variables
    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private static double salary = 60000.0;
    private Department department;
    private String hireDate;

    // Constructor
    public Employee(long employeeId, String firstName, String lastName,
                     String email, Department department, String hireDate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
        salary = 60000;
    }

    public Employee() {

    }

    // Methods
    public String getFullName() {
        String fullName = lastName + ", " + firstName;
        return fullName;
    }

    public double raiseSalary(double percent) {

        salary = salary + (salary * (percent/100));
        return salary;
    }


    // Setters and Getters
    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static double getSalary() {
        return salary;
    }

    public static void setSalary(double salary) {
        Employee.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
