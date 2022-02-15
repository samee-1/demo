package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository is responsible for data access layer
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}
