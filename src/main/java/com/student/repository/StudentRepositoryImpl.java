package com.student.repository;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryImpl implements StudentRepository
{
	@Autowired
	@Qualifier("myDataSource")
	private DataSource datasource;
	private JdbcTemplate jdbcTemplate;
	public StudentRepositoryImpl() { }

		@PostConstruct
		public void init()
		{
			jdbcTemplate=new JdbcTemplate(datasource);
			
		}
		public List<Student> getAllStudent()
		{
			List<Student> students=jdbcTemplate.query("Select * from student", new BeanPropertyRowMapper(Student.class));
			return students;
		}
	
		public String createStudent(Student student)
		{
			Object[] arr= {student.getName(),student.getEmail(), student.getPassword(),student.getSubject(),student.getAddress()};
			int rowCount=jdbcTemplate.update("Insert into student (name, email, password, subject, address)values (?,?,?,?,?)",arr);
			return rowCount>0? "Student Created":"Issue in student creation";
		}
		
		public Student getStudent(int id) 
		{
			Student student=jdbcTemplate.queryForObject("Select * from student where id=?", new Object[] {id}, new BeanPropertyRowMapper(Student.class));
			return student;
		}
		public String deleteStudent(int id)
		{
			int rowCount = jdbcTemplate.update("delete from student where id=?", new Object[] {id});
			return rowCount>0?"Student Deleted":"Issue in student deletion";
		}
		public String updateStudent(Student student)
		{	
		 		Object[] arr= {student.getName(),student.getEmail(),student.getPassword(),student.getSubject(),student.getAddress(),student.getId()};
		 		int rowCount=jdbcTemplate.update("Update student set name=?, email=?, password=?, subject=?, address=? where id=?",arr);
		 		return rowCount>0?"Student updated":"Issue in student updation";	
		}
		@SuppressWarnings("unchecked")
		public List<Student> studentBySubject(String subject)
		{
			try 
			{
			List<Student> students=jdbcTemplate.queryForObject("Select * from student where subject=?", new Object[] {subject},new BeanPropertyRowMapper(Student.class));
			return students;
			}catch (Exception e)
				{
				System.out.println("Empty result exception came");
				return null;
				}
		}
		
		public String authentication(String email, String password)
		{
			int rowCount=jdbcTemplate.queryForObject("Select * from student where email=? and password=?", new Object[] {email,password}, new BeanPropertyRowMapper(Student.class));
			return rowCount>0?"email and password is authenticated":"Invalid email or password";
		}
	}

