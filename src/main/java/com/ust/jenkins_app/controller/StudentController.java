package com.ust.jenkins_app.controller;

import com.ust.jenkins_app.entity.Student;
import com.ust.jenkins_app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/getStudent/{reg}")
    public Student getStudentByRegNo(@PathVariable String reg)
    {
        return studentService.getStudentByRegno(reg);
    }
}
