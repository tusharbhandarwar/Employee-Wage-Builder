package com.bridgelabz;

public class EmployeeWageBuilder {
    //class level variable
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    public static int computeEmpWage(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
        //variables
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        //computation
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;

            int random = (int) Math.floor(Math.random() * 10) % 3;
            switch (random) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + "Emp Hr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage: " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String args[]) {
        //UC8
        computeEmpWage("Accenture", 30, 20, 100);
        computeEmpWage("TCS", 40, 16, 50);
        computeEmpWage("DMART", 50, 10, 30);
        computeEmpWage("Amazon", 45, 12, 40);
    }
}
