package com.company;

public class Main {
    public static final int PRESENT = 1;
    public static final int ABSENT = 0;
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 8;
    public static final int MONTHLY_WORKING_DAYS = 20;
    public static final int MAX_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        Employee employee = new Employee();
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.setWagePerHour(WAGE_PER_HOUR);
        employeeWage.setFullDayHour(FULL_DAY_HOUR);
        employeeWage.setPartTimeHour(PART_TIME_HOUR);
        employeeWage.setMonthlyHours(MAX_WORKING_HOURS);
        employeeWage.setMonthlyWorkingDays(MONTHLY_WORKING_DAYS);
        employee.setEmployeeWage(employeeWage);
        int dailyEmployeeWage = employee.getDailyEmployeeWage(FULL_DAY_HOUR);
        System.out.println("Daily Employee Wage=" + dailyEmployeeWage);
        System.out.println("Monthly Wages=" + employee.calculateWagesPermonth());
        System.out.println("Monthly Wages or Max Working Hours Wages="+employee.calculateWagesTillMaxWorkingDaysOrMaxMonthlyHours());
    }
}
