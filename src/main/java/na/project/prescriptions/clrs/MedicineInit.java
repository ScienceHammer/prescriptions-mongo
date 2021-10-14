package na.project.prescriptions.clrs;

import na.project.prescriptions.art.AsciiArt;
import na.project.prescriptions.beans.DoseInstruction;
import na.project.prescriptions.beans.Medicine;
import na.project.prescriptions.beans.enums.DosageUnit;
import na.project.prescriptions.beans.enums.DoseFrequency;
import na.project.prescriptions.beans.enums.DoseType;
import na.project.prescriptions.repositories.MedicineRepository;
import org.apache.tomcat.util.buf.Ascii;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(2)
public class MedicineInit implements CommandLineRunner {

    @Autowired
    private MedicineRepository medicineRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(AsciiArt.medicine);

        DoseInstruction doseInstruction1 = DoseInstruction.builder().doseType(DoseType.CAP)
                .dosageAmount(500D)
                .dosageUnit(DosageUnit.mg)
                .numberOfDosages(2)
                .numberOfDoses(2)
                .doseFrequency(DoseFrequency.DAY)
                .numberOfTakingDays(20)
                .build();

        DoseInstruction doseInstruction2 = DoseInstruction.builder().doseType(DoseType.DROP)
                .dosageAmount(200D)
                .dosageUnit(DosageUnit.mL)
                .numberOfDosages(1)
                .numberOfDoses(2)
                .doseFrequency(DoseFrequency.DAY)
                .numberOfTakingDays(25)
                .build();

        Medicine medicine = Medicine.builder().names(Arrays.asList("acamol", "acemol"))
                .activeSubstance("acm")
                .description("pain killer")
                .doseInstructions(Arrays.asList(doseInstruction1,doseInstruction2))
                .registrationNumber("1115555")
                .build();

        medicineRepository.save(medicine);

        medicineRepository.findAll().forEach(System.out::println);


    }
}
