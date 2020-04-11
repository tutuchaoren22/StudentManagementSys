package com.example.StudentManagementSys.controller;

import com.example.StudentManagementSys.entities.Student;
import com.example.StudentManagementSys.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController {
    private StudentRepository studentRepository = new StudentRepository(new ArrayList<Student>() {{
        add(new Student("小一", "男", "1-1"));
        add(new Student("小二", "男", "1-2"));
        add(new Student("小四", "男", "1-4"));
        add(new Student("小五", "女", "1-5"));
        add(new Student("小六", "女", "1-6"));
    }});
}
