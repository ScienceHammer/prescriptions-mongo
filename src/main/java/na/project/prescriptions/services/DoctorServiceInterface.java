package na.project.prescriptions.services;

import na.project.prescriptions.beans.Prescription;
import na.project.prescriptions.beans.User;

import java.util.List;

public interface DoctorServiceInterface {

    void createPrescription(Prescription prescription);

    List<Prescription> findAllPrescriptions();

    void findSinglePrescription(String prescriptionId);

    User findSingleUser(String userId);

}
