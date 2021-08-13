package com.bridgelabz;

public class EmployeeWageBuilder {
    public static final int IS_FUll_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HRS = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        //UC5
        EmpWage();
    }

    public static void EmpWage() {
        int empHrs = 0;
        int dailyEmpWage = 0;
        int totalEmpWage = 0;
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            int value = (int) Math.floor(Math.random() * 10) % 3;
            switch (value) {
                case IS_FUll_TIME:
                    empHrs = 8;
                    System.out.println("Employee is full time Present");
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    System.out.println("Employee is Part time Present");
                    break;
                default:
                    empHrs = 0;
                    System.out.println("Employee is Absent");
            }
            dailyEmpWage = empHrs * EMP_RATE_PER_HRS;
            totalEmpWage = totalEmpWage + dailyEmpWage;
            System.out.println("DailyEmpWage is:" + dailyEmpWage);
        }
        System.out.println("Total Employee Wage is:" + totalEmpWage);
    }
}
