package com.example.sms.repository;

import com.example.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
//no need to add @Repository. JpaRepository internally added this in SimpleJpaRepository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
