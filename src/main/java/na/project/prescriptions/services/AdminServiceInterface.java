package na.project.prescriptions.services;

import na.project.prescriptions.beans.Medicine;

import java.util.List;

public interface AdminServiceInterface {

    void addMedicine(Medicine medicine);

    void updateMedicine(String medicineId, Medicine medicine);

    Medicine findSingleMedicine(String medicineId);

    List<Medicine> findAllMedicines();

    void deleteSingleMedicine(String medicineId);


}
