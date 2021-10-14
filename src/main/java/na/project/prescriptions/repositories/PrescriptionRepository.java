package na.project.prescriptions.repositories;

import na.project.prescriptions.beans.Prescription;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrescriptionRepository extends MongoRepository<Prescription, String> {
}
