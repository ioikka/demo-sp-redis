package com.example.demo.sp.redis.repository;

import com.example.demo.sp.redis.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
}
