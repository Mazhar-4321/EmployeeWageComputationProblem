package com.company;

public class Main {
    public static final int PRESENT = 1;
    public static final int ABSENT = 0;

    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        Employee employee = new Employee();
        switch (employee.getAttendance()) {
            case PRESENT:
                System.out.println("Present");
                break;
            case ABSENT:
                System.out.println("Absent");
                break;
        }
    }
}
