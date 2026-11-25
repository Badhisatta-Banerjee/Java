package Ass15;

class Hospital {
    private String hospitalName;
    private String location;

    public Hospital(String hospitalName, String location) {
        this.hospitalName = hospitalName;
        this.location = location;
    }

    public void displayHospital() {
        System.out.println("----- Hospital Information -----");
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Location: " + location);
    }
}

class Doctor extends Hospital {
    private int doctorID;
    private String doctorName;
    private String specialization;

    public Doctor(String hospitalName, String location, int doctorID, String doctorName, String specialization) {
        super(hospitalName, location);
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    public void displayDoctor() {
        System.out.println("\n----- Doctor Information -----");
        System.out.println("Doctor ID: " + doctorID);
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
    }
}

class Surgeon extends Doctor {
    private String surgeryType;
    private int operationTheatreNumber;

    public Surgeon(String hospitalName, String location, int doctorID, String doctorName, String specialization, String surgeryType, int operationTheatreNumber) {
        super(hospitalName, location, doctorID, doctorName, specialization);
        this.surgeryType = surgeryType;
        this.operationTheatreNumber = operationTheatreNumber;
    }

    public void displayAllInformation() {
        displayHospital();
        displayDoctor();

        System.out.println("\n----- Surgeon Information -----");
        System.out.println("Surgery Type: " + surgeryType);
        System.out.println("Operation Theatre Number: " + operationTheatreNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        String hospitalName = "Apollo Hospital";
        String location = "Kolkata";
        int doctorID = 101;
        String doctorName = "Dr. Anirban Sen";
        String specialization = "Cardiology";
        String surgeryType = "Heart Bypass Surgery";
        int operationTheatreNumber = 3;

        Surgeon surgeonObj = new Surgeon(hospitalName, location, doctorID, doctorName, specialization, surgeryType, operationTheatreNumber);
        surgeonObj.displayAllInformation();
    }
}
