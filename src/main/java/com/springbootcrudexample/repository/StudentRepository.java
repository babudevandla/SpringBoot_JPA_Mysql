package com.springbootcrudexample.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootcrudexample.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable> {

}
