package com.java.sample.first;

public class GeneralPractitioner extends Doctor{
    public static int hourlyRate;

    public GeneralPractitioner(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public int totalPayment(int visitingHours) {
        int totalPayment = hourlyRate * visitingHours;
        return super.totalPayment(totalPayment);
    }
}
