package com.student.service;
import java.util.List;
import com.student.entity.Student;


public interface StudentService {
	public List<Student> allStudents();
	
	public String createStudent(Student student);
	public Student getStudent(int id);
	public String updateStudent(Student student);
	public String deleteStudent(int id);
	public List<Student> studentBySubject(String subject);

}
