package na.project.prescriptions.repositories;

import na.project.prescriptions.beans.Medicine;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicineRepository extends MongoRepository<Medicine, String> {
}
