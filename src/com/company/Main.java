package com.company;

public class Main {
    public static final int PRESENT = 1;
    public static final int ABSENT = 0;
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        Employee employee = new Employee();
        int attendanceStatus = PRESENT;
        switch (employee.getAttendance()) {
            case PRESENT:
                System.out.println("Present");
                break;
            case ABSENT:
                System.out.println("Absent");
                attendanceStatus = ABSENT;
                break;
        }
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.setWagePerHour(WAGE_PER_HOUR);
        employeeWage.setFullDayHour(FULL_DAY_HOUR);
        employee.setEmployeeWage(employeeWage);
        int dailyEmployeeWage = attendanceStatus * employee.getDailyEmployeeWage();
        System.out.println("Daily Employee Wage=" + dailyEmployeeWage);
        employeeWage.setPartTimeHour(PART_TIME_HOUR);


    }
}
