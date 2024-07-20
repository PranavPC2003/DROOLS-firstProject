package com.drools.DemoApp.rep;

import com.drools.DemoApp.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {
    
}
