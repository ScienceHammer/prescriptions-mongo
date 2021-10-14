package na.project.prescriptions.services;

import na.project.prescriptions.beans.Prescription;
import na.project.prescriptions.beans.User;

import java.util.List;

public interface PatientServiceInterface {

    List<Prescription> findAllPrescriptions();

    Prescription findSinglePrescription(String prescriptionId);

    List<User> findAllDoctors();

    User findSingleDoctor(String prescriptionId);
}
