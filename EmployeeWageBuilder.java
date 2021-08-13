package com.bridgelabz;

public class EmployeeWageBuilder {
    //class level variable
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    private static int EMP_RATE_PER_HOUR = 20;
    private static int  NUM_OF_WORKING_DAYS = 20;
    private static final int MAX_HRS_IN_MONTH = 100;

    public static int computeEmpWage(){
        //variables
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        //computation
        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
            totalWorkingDays++;

            int random=(int)Math.floor(Math.random()*10) % 3;
            switch (random)
            {
                case IS_FULL_TIME: empHrs = 8;
                    break;
                case IS_PART_TIME: empHrs = 4;
                    break;
                default: empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + "Emp Hr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage: " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String args[]){
        //UC7
        computeEmpWage(); //calling method
    }
}
