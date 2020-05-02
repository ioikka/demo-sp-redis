package com.example.demo.sp.redis.repository;

import com.example.demo.sp.redis.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;


@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void addNewStudent() {
        Student s = new Student();
        s.setGender(Student.Gender.FEMALE);
        s.setName("name");
        s.setGrade(1);
        s.setId(UUID.randomUUID().toString());

        studentRepository.save(s);

        Iterable<Student> all = studentRepository.findAll();
    }
}
