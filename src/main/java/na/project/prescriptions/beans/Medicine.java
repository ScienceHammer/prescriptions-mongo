package na.project.prescriptions.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Medicine {

    @Id
    private String id;
    private List<String> names;
    private String activeSubstance;
    private String registrationNumber;
    private String description;
    private List<DoseInstruction> doseInstructions;
    private List<Prescription> prescriptions;
}
