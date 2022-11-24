package com.company;

public class Employee {
    private final int MONTHLY_WAGE_CALCULATION = 1;
    private final int MONTHLY_WAGE_OR_MAX_WORKING_HOURS_CALCULATION = 2;
    private Integer attendance;
    private EmployeeWage employeeWage;
    private EmployeeType employeeType;
    private Integer wagesPermonth;
    private Integer wagesForMaxWorkingDaysOrMaxMonthlyHours;
    private Boolean flag;

    public int calculateWagesTillMaxWorkingDaysOrMaxMonthlyHours() {
        if (wagesForMaxWorkingDaysOrMaxMonthlyHours != null) {
            return wagesForMaxWorkingDaysOrMaxMonthlyHours;
        }
        wagesForMaxWorkingDaysOrMaxMonthlyHours = 0;
        int workedDays = 0;
        int workedHours = 0;
        flag = true;
        final int MONTHLY_WORKING_DAYS = employeeWage.getMonthlyWorkingDays();
        final int MAX_WORKING_HOURS = employeeWage.getMonthlyHours();
        final int PRESENT = 1;
        final int ABSENT = 0;
        final int PART_TIME_HOUR = employeeWage.getPartTimeHour();
        final int FULL_DAY_HOUR = employeeWage.getFullDayHour();
        while (workedDays <= MONTHLY_WORKING_DAYS || workedHours <= MAX_WORKING_HOURS) {
            switch (getAttendance()) {
                case PRESENT:
                    int currentWorkingHours = getEmployeeType().equals(EmployeeType.PART_TIME) ? PART_TIME_HOUR : FULL_DAY_HOUR;
                    setWagesPermonthOrMaxMonthlyHours(MONTHLY_WAGE_OR_MAX_WORKING_HOURS_CALCULATION, currentWorkingHours);
                    workedHours += currentWorkingHours;
                    break;
                case ABSENT:
                    break;
            }
            workedDays++;
        }
        flag = false;
        return wagesForMaxWorkingDaysOrMaxMonthlyHours;
    }

    public int calculateWagesPermonth() {
        if (wagesPermonth != null) {
            return wagesPermonth;
        }
        wagesPermonth = 0;
        int workedDays = 0;
        flag = true;
        final int MONTHLY_WORKING_DAYS = employeeWage.getMonthlyWorkingDays();
        final int PRESENT = 1;
        final int ABSENT = 0;
        final int PART_TIME_HOUR = employeeWage.getPartTimeHour();
        final int FULL_DAY_HOUR = employeeWage.getFullDayHour();
        while (workedDays <= MONTHLY_WORKING_DAYS) {
            switch (getAttendance()) {
                case PRESENT:
                    int currentWorkingHours = getEmployeeType().equals(EmployeeType.PART_TIME) ? PART_TIME_HOUR : FULL_DAY_HOUR;
                    setWagesPermonthOrMaxMonthlyHours(MONTHLY_WAGE_CALCULATION, currentWorkingHours);
                    break;
                case ABSENT:
                    break;
            }
            workedDays++;
        }
        flag = false;
        return wagesPermonth;
    }

    private void setWagesPermonthOrMaxMonthlyHours(int offset, int currentWorkingHours) {
        if (offset == MONTHLY_WAGE_CALCULATION) {
            this.wagesPermonth += getDailyEmployeeWage(currentWorkingHours);
        } else {
            this.wagesForMaxWorkingDaysOrMaxMonthlyHours += getDailyEmployeeWage(currentWorkingHours);
        }
    }

    public EmployeeType getEmployeeType() {
        setEmployeeType(getRandomNumber(0, 1) == 0 ? EmployeeType.PART_TIME : EmployeeType.FULL_TIME);
        return employeeType;
    }

    private void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public int getDailyEmployeeWage(int workingHours) {
        return workingHours * employeeWage.getWagePerHour();
    }

    public EmployeeWage getEmployeeWage() {
        return employeeWage;
    }

    public void setEmployeeWage(EmployeeWage employeeWage) {
        this.employeeWage = employeeWage;
    }

    public int getAttendance() {
        return attendance == null || flag ? getRandomNumber(0, 1) : attendance;
    }

    private int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

}
