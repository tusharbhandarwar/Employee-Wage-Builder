package com.bridgelabz;

public class EmployeeWageBuilder {
    //class level variable

    private static int IS_FULL_TIME = 1;
    private static int WAGE_PER_HRS = 20;

    public static void main(String args[]) {
        //UC1
        empCheck();
    }
    public static void empCheck() {
        int dailyEmpWage = 0;
        int empHrs = 0;
        double value = Math.floor(Math.random() * 10) % 2;
        if (value == IS_FULL_TIME) {
            empHrs = 8;
            System.out.println("Employee is Present");
        } else {
            empHrs = 0;
            System.out.println("Employee is Absent");
        }
        dailyEmpWage = WAGE_PER_HRS * empHrs;
        System.out.println("Daily Employee Wage is:" +dailyEmpWage);
    }
}
