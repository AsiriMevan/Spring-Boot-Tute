package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Mevan",
                        "mevan.spring@boot.com",
                        LocalDate.of(1999, Month.APRIL,28),
                        21
                )
        );
    }
}
