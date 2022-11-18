package com.java.sample.first;

public class Doctor {
    public static String doctorName;
    public static String doctorAddress;
    public static String doctorPhoneNumber;
    public static String doctorRegNumber;

    public Doctor() {
    }

    public Doctor(String doctorName, String doctorAddress, String doctorPhoneNumber, String doctorRegNumber) {
        this.doctorName = doctorName;
        this.doctorAddress = doctorAddress;
        this.doctorPhoneNumber = doctorPhoneNumber;
        this.doctorRegNumber = doctorRegNumber;
    }

    public int totalPayment(int a){
        return a;
    }
}
