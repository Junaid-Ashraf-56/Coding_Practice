package Inhertance;

import java.time.LocalDate;

// Base Class
class Appointment {
    protected int appointmentId;
    protected String patientName;
    protected LocalDate appointmentDate;

    Appointment(int appointmentId, String patientName, LocalDate appointmentDate) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.appointmentDate = appointmentDate;
    }

    void displayAppointmentDetails() {
        System.out.println("Appointment ID: " + appointmentId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Date: " + appointmentDate);
    }

    // Static method to compare two appointments
    static void compareAppointments(Appointment a1, Appointment a2) {
        if (a1.appointmentDate.equals(a2.appointmentDate)) {
            System.out.println("Appointments are scheduled on the SAME day.");
        } else {
            System.out.println("Appointments are on DIFFERENT days.");
        }
    }
}

// Subclass 1
class DoctorAppointment extends Appointment {
    private final String specialistType;

    DoctorAppointment(int id, String name, LocalDate date, String specialistType) {
        super(id, name, date); // constructor chaining
        this.specialistType = specialistType;
    }

    @Override
    void displayAppointmentDetails() {
        super.displayAppointmentDetails();
        System.out.println("Specialist Type: " + specialistType);
    }
}

// Subclass 2
class LabTestAppointment extends Appointment {
    private final String testType;

    LabTestAppointment(int id, String name, LocalDate date, String testType) {
        super(id, name, date); // constructor chaining
        this.testType = testType;
    }

    @Override
    void displayAppointmentDetails() {
        super.displayAppointmentDetails();
        System.out.println("Test Type: " + testType);
    }
}

// Main Class
public class Basic {
    public static void main(String[] args) {
        DoctorAppointment da = new DoctorAppointment(101, "Ali", LocalDate.of(2025, 4, 15), "Cardiologist");
        LabTestAppointment la = new LabTestAppointment(102, "Ahmed", LocalDate.of(2025, 4, 15), "Blood Test");

        System.out.println("Doctor Appointment Details:");
        da.displayAppointmentDetails();

        System.out.println("\nLab Test Appointment Details:");
        la.displayAppointmentDetails();

        System.out.println("\nComparing Appointments:");
        Appointment.compareAppointments(da, la);
    }
}
