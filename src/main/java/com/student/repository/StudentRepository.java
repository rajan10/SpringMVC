package com.student.repository;
import com.student.entity.Student;

import java.util.List;

public interface StudentRepository { //CRUD
	public List<Student> getAllStudent();
	
	public String createStudent(Student student);
	public Student getStudent(int id); //Student student
	public String deleteStudent(int id); //rowCount
	public String updateStudent(Student student);
	public String authentication(String email, String password);
	public List<Student> studentBySubject(String subject);
}
