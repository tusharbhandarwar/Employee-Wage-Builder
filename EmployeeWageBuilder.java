package com.bridgelabz;

public class EmployeeWageBuilder {
    //class level variable
    private static int IS_FULL_TIME = 1;
    private static int IS_PART_TIME = 2;
    private static int WAGE_PER_HRS = 20;

    public static void main(String args[]) {
        //UC3
        empCheck();
    }

    public static void empCheck() {
        int empHrs = 0;
        double value = Math.floor(Math.random() * 10) % 3;
        if (value == IS_FULL_TIME) {
            System.out.println("Employee is Present");
            empHrs = 8;
        } else if (value == IS_PART_TIME) {
            System.out.println("Employee is PartTime Present");
            empHrs = 4;
        } else {
            System.out.println("Employee is Absent");
        }
        double dailyEmpWage = WAGE_PER_HRS * empHrs;
        System.out.println("Daily Employee Wage:" + dailyEmpWage);

    }
}
