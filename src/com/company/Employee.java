package com.company;

public class Employee {
    private int attendance;
    private EmployeeWage employeeWage;
    private EmployeeType employeeType;
    private int wagesPermonth;

    public int getWagesPermonth() {
        return wagesPermonth;
    }

    public void setWagesPermonth(int wagesPermonth) {
        this.wagesPermonth = this.wagesPermonth+ employeeWage.getWagePerHour()*wagesPermonth;
    }

    public EmployeeType getEmployeeType() {
        int randomNumber = getRandomNumber(0, 1);
        setEmployeeType(randomNumber == 0 ? EmployeeType.PART_TIME : EmployeeType.FULL_TIME);
        return employeeType;
    }

    private void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

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
