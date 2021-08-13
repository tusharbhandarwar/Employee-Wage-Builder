package com.bridgelabz;

public class EmployeeWageBuilder {
    //UC9
    //class level variable
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;

    private  final String company;
    private final int EMP_RATE_PER_HOUR;
    private final int NUM_OF_WORKING_DAYS;
    private final int MAX_HRS_IN_MONTH;
    private int totalEmpWage;


    public EmployeeWageBuilder(String company, int EMP_RATE_PER_HOUR, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH){
        this.company = company;
        this.EMP_RATE_PER_HOUR = EMP_RATE_PER_HOUR;
        this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
        this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;

    }

    public int computeEmpWage(){
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

        EmployeeWageBuilder accenture = new EmployeeWageBuilder("Accenture", 30, 20, 100);
        EmployeeWageBuilder tcs = new EmployeeWageBuilder("TCS",40,16,50);
        EmployeeWageBuilder dmart = new EmployeeWageBuilder("DMART", 50,10,30);
        EmployeeWageBuilder amazon = new EmployeeWageBuilder("Amazon",30,12,40);
        accenture.computeEmpWage();
        System.out.println(accenture);
        tcs.computeEmpWage();
        System.out.println(tcs);
        dmart.computeEmpWage();
        System.out.println(dmart);
        amazon.computeEmpWage();
        System.out.println(amazon);

    }
}
