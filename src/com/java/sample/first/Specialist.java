package com.java.sample.first;

public class Specialist extends Doctor{
    public static int chargePerPatient;

    public Specialist(int chargePerPatient) {
        this.chargePerPatient = chargePerPatient;
    }

    @Override
    public int totalPayment(int numberOfPatients) {
        int totalPayment = chargePerPatient * numberOfPatients;
        return super.totalPayment(totalPayment);
    }
}
