package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    // ==============================
    // 1. FIELD INJECTION
    // ==============================
    @Autowired
    Laptop ref;


    // ==============================
    // 2. CONSTRUCTOR INJECTION
    // ==============================
    @Autowired
    Student(Laptop ref) {
        this.ref = ref;
    }


    // ==============================
    // 3. SETTER INJECTION
    // ==============================
    @Autowired
    public void setRef(Laptop ref) {
        this.ref = ref;
    }


    public void study() {
        System.out.println("Student is working");
    }


    public void check() {
        ref.work();
    }
}
