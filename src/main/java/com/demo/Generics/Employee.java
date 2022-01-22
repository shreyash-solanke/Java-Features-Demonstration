package com.demo.Generics;

/**
 * This is Employee class which implements Comparable interface to make instances comparable.
 * @author Shreyash Solunke
 * @version 1.0.0
 */
public class Employee implements Comparable<Employee>  {
    private long employeeId;
    private String employeeFirstName;
    private String employeeLastName;

    /**
     * Employee constructor object
     * @param employeeId - Employee ID
     * @param employeeFirstName - First Name
     * @param employeeLastName - Last Name
     */
    public Employee(long employeeId, String employeeFirstName, String employeeLastName) {
        this.employeeId = employeeId;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }


    /**
     *
     * @return String with employee object members
     */
    @Override
    public String toString() {
        return "employee{" +
                "employeeId=" + employeeId +
                ", employeeFirstName='" + employeeFirstName + '\'' +
                ", employeeLastName='" + employeeLastName + '\'' +
                '}';
    }

    /**
     *
     * @param o - Employee object which is compared to this Object.
     * @return value 0 if both objects have same ID,
     * value greater than 0 if this employee ID is greater than argument employee ID,
     * value less than 0 if this employee ID is smaller than argument employee ID.
     */
    @Override
    public int compareTo(Employee o) {
        Long thisEmployeeId = Long.valueOf(this.employeeId);
        Long thatEmployeeId = Long.valueOf(o.employeeId);

        return thisEmployeeId.compareTo(thatEmployeeId);
    }
}
