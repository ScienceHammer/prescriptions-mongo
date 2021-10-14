package na.project.prescriptions.beans;

import lombok.*;
import lombok.experimental.SuperBuilder;
import na.project.prescriptions.beans.enums.Gender;
import na.project.prescriptions.beans.enums.Role;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Date;
import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class User {

    @Id
    private String id;
    private String userIdNumber;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Gender gender;
    private Date birthday;
    private List<Role> roles;
    private List<Prescription> prescriptions;
}
