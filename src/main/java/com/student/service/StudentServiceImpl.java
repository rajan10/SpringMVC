package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
@Autowired
private StudentRepository repository;
public List<Student> allStudents()
	{
		List<Student> students=repository.getAllStudent();
		return students;
	}
	public String createStudent(Student st)
	{
		return repository.createStudent(st);
	}
	public Student getStudent(int id)
	{
		return repository.getStudent(id);
		
	}
	public String deleteStudent(int id)
	{
		return repository.deleteStudent(id);
	}
	public String authentication(String email, String password)
	{
		String st= repository.authentication(email, password);
		return st;
	}
	public List<Student> studentBySubject(String subject)
	{
		List <Student> stu= repository.studentBySubject(subject);
		return stu;
		}
	public String updateStudent(Student student)
	{
		String message=repository.updateStudent(student);
		return message;
	}
}

