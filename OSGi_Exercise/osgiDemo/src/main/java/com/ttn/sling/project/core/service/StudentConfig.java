package com.ttn.sling.project.core.service;

import java.util.List;

public interface StudentConfig {

    String addStudent(Student student);

    boolean deleteStudent(int id);

    boolean isStudentPassed(int id);

    Student getStudent(int id);

    List<Student> getAllStudents();

}
