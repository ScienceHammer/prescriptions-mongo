package na.project.prescriptions.beans;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class DoctorUser extends User {

    private String licenseNumber;

}

