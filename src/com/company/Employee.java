package com.company;

public class Employee {
    private int attendance;
    private EmployeeWage employeeWage;

    public int getDailyEmployeeWage() {
        return employeeWage.getFullDayHour() * employeeWage.getWagePerHour();
    }

    public EmployeeWage getEmployeeWage() {
        return employeeWage;
    }

    public void setEmployeeWage(EmployeeWage employeeWage) {
        this.employeeWage = employeeWage;
    }

    public int getAttendance() {
        attendance = getRandomNumber(0, 1);
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    private int getRandomNumber(int min, int max) {
        int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
        return randomNumber;
    }

}
