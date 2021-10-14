package na.project.prescriptions.repositories;

import na.project.prescriptions.beans.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
