package na.project.prescriptions.clrs;


import na.project.prescriptions.art.AsciiArt;
import na.project.prescriptions.beans.*;
import na.project.prescriptions.beans.enums.*;
import na.project.prescriptions.repositories.PrescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(3)
public class PrescriptionInit implements CommandLineRunner {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(AsciiArt.prescription);

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

        User patient = User.builder().username("nour")
                .password("12345")
                .firstName("Nour")
                .lastName("Haj")
                .email("nor.alden@mail.com")
                .phoneNumber("0544222480")
                .gender(Gender.MALE)
                .roles(Arrays.asList(Role.USER)).build();

        User doctor = DoctorUser.builder()
                .username("bhaa")
                .password("12345")
                .firstName("Bhaa")
                .lastName("Haj")
                .email("bhaa.alden@mail.com")
                .phoneNumber("0544222480")
                .gender(Gender.MALE)
                .roles(Arrays.asList(Role.DOCTOR))
                .licenseNumber("2222555").build();

        Prescription prescription = Prescription.builder().reason("Pain")
                .doctor(doctor)
                .patient(patient)
                .medicines(Arrays.asList(medicine))
                .build();

        prescriptionRepository.save(prescription);

        prescriptionRepository.findAll().forEach(System.out::println);
    }
}
