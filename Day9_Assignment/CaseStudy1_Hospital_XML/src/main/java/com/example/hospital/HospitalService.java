package com.example.hospital;

public class HospitalService {
    private Patient patient;
    private Appointment appointment;
    private Billing billing;

    // Setters
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public void manageHospital() {
        patient.registerPatient();
        appointment.bookAppointment();
        billing.generateBill();
    }
}
