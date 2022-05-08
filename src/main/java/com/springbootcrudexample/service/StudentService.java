package com.springbootcrudexample.service;

import java.util.List;

import com.springbootcrudexample.entity.Student;

public interface StudentService {

	public Student save(Student student);
	public Student update(Student student);
	public Student get(Long id);
	public void delete(Student student);
	public List<Student> findAll();
}
