package na.project.prescriptions.clrs;

import na.project.prescriptions.art.AsciiArt;
import na.project.prescriptions.beans.DoctorUser;
import na.project.prescriptions.beans.User;
import na.project.prescriptions.beans.enums.Gender;
import na.project.prescriptions.beans.enums.Role;
import na.project.prescriptions.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Order(1)
public class UserInit implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(AsciiArt.user);
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




        userRepository.save(patient);
        userRepository.save(doctor);

        userRepository.findAll().forEach(System.out::println);
    }
}
