import java.io.*;
import java.util.*;

class Patient extends Person {
    // define fields for admission date, discharge date, patient ID, and attending physician
    private Date admitDate;
    private Date dischargeDate;
    private int pID;
    private Doctor attendingPhysician;

    // constructor
    public Patient(int pID, String firstName, String lastName, Doctor attendingPhysician, Date admitDate, Date dischargeDate) {
        super(firstName, lastName);
        this.pID = pID;
        this.attendingPhysician = attendingPhysician;
        this.admitDate = admitDate;
        this.dischargeDate = dischargeDate;
    }

    // accessor for PID
    public int getPatientID() {
        return pID;
    }

    // accessor for attending physician
    public Doctor getAttendingPhysician() {
        return attendingPhysician;
    }

    // accessor for admission date
    public Date getAdmitDate() {
        return admitDate;
    }

    // accessor for discharge date
    public Date getDischargeDate() {
        return dischargeDate;
    }

    // override toString method for printing
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Patient: ").append(super.toString()).append("\n");
        sb.append("ID: ").append(pID).append("\n");
        sb.append("Attending Physician: ").append(attendingPhysician).append("\n");
        sb.append("Admit Date: ").append(admitDate).append("\n");
        sb.append("Discharge Date: ").append(dischargeDate).append("\n");
        return sb.toString();
    }
}
