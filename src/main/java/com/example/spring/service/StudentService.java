package com.example.spring.service;

import com.example.spring.model.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = Arrays.asList(new Student(1, "Vallabh ", 10), new Student(2, "Harsh", 11));

    public List<Student> getAllStudents()
    {
        return students;
    }

}
