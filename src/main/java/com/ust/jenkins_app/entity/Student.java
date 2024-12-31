package com.ust.jenkins_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private Long studentId;

    private String name;

    private String regNo;
    private String contact;

    public Student() {
    }

    public Student(Long studentId, String name, String regNo, String contact) {
        this.studentId = studentId;
        this.name = name;
        this.regNo = regNo;
        this.contact = contact;
    }


    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
