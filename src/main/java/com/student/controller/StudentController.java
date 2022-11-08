package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.service.StudentService;
import com.student.entity.*;
@Controller
public class StudentController {
	
@Autowired
private StudentService service;
@GetMapping("/allStudents")
public String allStudents(Model model)
{
	List<Student> students=service.allStudents();
	model.addAttribute("allStudents",students);
	return "studentsHome";
}
@GetMapping("/registerStudent")
public String registration() {
		return "registration";
	}
@PostMapping("/createStudent")
public String createStudent(@ModelAttribute Student st, Model model )
{
	String message=service.createStudent(st);
	//System.out.println("here");
	model.addAttribute("message", message);//brings the message var from studentRepo db if record is added to db
	return "registration";
}
@GetMapping("/updateStudent")
public String updateStudent(Model model, @RequestParam int id)
{
	Student st=service.getStudent(id); //retrieve old data that needs to be updated
	model.addAttribute("student", st);
	return "editStudent";
}
@PostMapping("/editStudent")   //insert edited data to db
public String editStudent(@ModelAttribute Student student, Model model)
	{
		String message=service.updateStudent(student);
		model.addAttribute("message",message);
		return "editStudent";
	}
@GetMapping("/deleteStudent")
public String deleteStudent(@RequestParam int id,Model model) {
	String message = service.deleteStudent(id);
	model.addAttribute("message", message);
	return "deleteStudent";
}
@PostMapping("/searchbySubject")
public String studentBySubject(@RequestParam String subject, Model model )
{
	List<Student> students =service.studentBySubject(subject);
	model.addAttribute("subjects", students);
	return "studentsHome";
}

}


