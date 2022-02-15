package com.example.demo.student;


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
                Student leo =
                        new Student(
                        "leo",
                        "leo@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5)
                );
                Student Kylian =
                        new Student(
                        "Kylian",
                        "kili@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5)
                );

                repository.saveAll(
                        List.of(leo, Kylian)
                );

            };

    }
}
