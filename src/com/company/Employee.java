package com.company;

public class Employee {
    private int attendance;

    public int getAttendance() {
        attendance = getRandomNumber(0, 1);
        return attendance;
    }

    private int getRandomNumber(int min, int max) {
        int randomNumber = (int) (Math.random() * (max - min+1)) +min;
        System.out.println(randomNumber);
        return randomNumber;
    }

}
