package na.project.prescriptions.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import na.project.prescriptions.beans.enums.DosageUnit;
import na.project.prescriptions.beans.enums.DoseFrequency;
import na.project.prescriptions.beans.enums.DoseType;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DoseInstruction {

    private DoseType doseType;
    private Integer numberOfDosages;
    private Double dosageAmount;
    private DosageUnit dosageUnit;
    private Integer numberOfDoses;
    private DoseFrequency doseFrequency;
    private Integer numberOfTakingDays;



}
