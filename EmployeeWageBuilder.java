package com.bridgelabz;

public class EmployeeWageBuilder {
    //class level variable

    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    private static int WAGE_PER_HRS = 20;

    public static void main(String args[]) {

        //UC4
        empCheck();
    }

    public static void empCheck() {
        int empHrs = 0;
        int dailyEmpWage = 0;
        int value = (int) Math.floor(Math.random() * 10) % 3;
        switch ((int) value) {
            case IS_FULL_TIME:
                empHrs = 8;
                System.out.println("Employee is Full time Present");
                break;

            case IS_PART_TIME:
                empHrs = 4;
                System.out.println("Employee is Part time Present");
                break;
            default:
                System.out.println("Employee is Absent");
        }
        dailyEmpWage = WAGE_PER_HRS * empHrs;
        System.out.println("Daily Employee Wage:" + dailyEmpWage);
    }
}
