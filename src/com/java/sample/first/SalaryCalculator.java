package com.java.sample.first;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME!");
        System.out.println("Enter doctor type - 1 for GP, 2 for SP");
        int type = sc.nextInt();
        if(type == 1){
            System.out.println("enter hourly rate");
            int hourlyRate = sc.nextInt();
            System.out.println("enter number of hours");
            int numberOfHours = sc.nextInt();
            GeneralPractitioner generalPractitioner = new GeneralPractitioner(hourlyRate);
            int totalSalary = generalPractitioner.totalPayment(numberOfHours);
            System.out.println("your total salary is : " + totalSalary);
        } else {
            System.out.println("enter charge per patient");
            int chargePerPatient = sc.nextInt();
            System.out.println("enter number of patients");
            int numberOfPatients = sc.nextInt();
            Specialist specialist = new Specialist(chargePerPatient);
            int totalSalary = specialist.totalPayment(numberOfPatients);
            System.out.println("your total salary is : " + totalSalary);
        }
        System.out.println();
    }
}
