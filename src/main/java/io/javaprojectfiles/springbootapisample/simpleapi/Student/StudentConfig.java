package io.javaprojectfiles.springbootapisample.simpleapi.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student bob = new Student(
                    "Bob",
                    "Bob.thebuolder@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5)

            );
            Student alex = new Student(
                    "alex",
                    "alex.thebuolder@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5)

            );
            Student frank = new Student(
                    "frank",
                    "frank.thebuolder@gmail.com",
                    LocalDate.of(2000, Month.JANUARY,5)

            );
            repository.saveAll(List.of(bob,alex,frank));
        };
    }
}
