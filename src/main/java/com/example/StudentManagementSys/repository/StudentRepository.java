package com.example.StudentManagementSys.repository;

import com.example.StudentManagementSys.entities.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentRepository {
    private List<Student> allStudents = new ArrayList<>();

    public StudentRepository() {
    }

    public StudentRepository(List<Student> allStudents) {
        this.allStudents = allStudents;
    }

    public List<Student> getAllStudents() {
        return allStudents;
    }

    @Override
    public String toString() {
        StringBuilder allStudentsString = new StringBuilder();
        Iterator list = allStudents.listIterator();
        while (list.hasNext()) {
            allStudentsString.append(list.next()).append("\n");
        }
        return allStudentsString.toString();
    }

    public boolean addStudent(Student student) {
        for (Student allStudent : allStudents) {
            if (allStudent.getName().equals(student.getName())) {
                return false;
            }
        }
        allStudents.add(student);
        return true;
    }

    public Student getStudentByName(String name) {
        for (Student allStudent : allStudents) {
            if (allStudent.getName().equals(name)) {
                return allStudent;
            }
        }
        return new Student();
    }

    public boolean deleteStudentByName(String name) {
        Iterator list = allStudents.listIterator();
        while (list.hasNext()) {
            if (list.next().equals(name)) {
                list.remove();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
