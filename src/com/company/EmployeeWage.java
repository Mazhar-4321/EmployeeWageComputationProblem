package com.company;

public class EmployeeWage {
    private int fullDayHour;
    private int wagePerHour;
    private int partTimeHour;
    private int monthlyHours;
    private int monthlyWorkingDays;

    public int getMonthlyWorkingDays() {
        return monthlyWorkingDays;
    }

    public void setMonthlyWorkingDays(int monthlyWorkingDays) {
        this.monthlyWorkingDays = monthlyWorkingDays;
    }

    public int getMonthlyHours() {
        return monthlyHours;
    }

    public void setMonthlyHours(int monthlyHours) {
        this.monthlyHours = monthlyHours;
    }

    public int getPartTimeHour() {
        return partTimeHour;
    }

    public void setPartTimeHour(int partTimeHour) {
        this.partTimeHour = partTimeHour;
    }

    public int getFullDayHour() {
        return fullDayHour;
    }

    public void setFullDayHour(int fullDayHour) {
        this.fullDayHour = fullDayHour;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(int wagePerHour) {
        this.wagePerHour = wagePerHour;
    }
}
