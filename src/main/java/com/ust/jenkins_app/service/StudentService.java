package com.ust.jenkins_app.service;


import com.ust.jenkins_app.entity.Student;
import com.ust.jenkins_app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public Student getStudentByRegno(String regNo){
        return studentRepository.findByRegNo(regNo);
    }
}
