package com.drools.DemoApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.drools.DemoApp.model.Student;

@RestController
public class StudentController {
    
    @Autowired
    private com.drools.DemoApp.rep.StudentRepository studentRepository;

    @PostMapping("/student")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
        Student save = this.studentRepository.save(student);
        return ResponseEntity.ok(save);
    }

    @GetMapping("/student")
    public ResponseEntity<?> getStudents()
    {
        return ResponseEntity.ok(this.studentRepository.findAll());
    }
}
