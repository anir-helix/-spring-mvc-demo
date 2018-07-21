package com.anir.springdemo.mvc.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.anir.springdemo.mvc.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showStudNameForm(Model modelStud){
		//Create Student object
		Student theStud = new Student();
		
		modelStud.addAttribute("student", theStud);
		modelStud.addAttribute("theCountryOptions", countryOptions);
		
		return "show-student";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent){
		
		//Log Data
		System.out.println("The Student: " + theStudent.getFirstName() + " "+ theStudent.getLastName());
		System.out.println("The Student Country: " + theStudent.getCountry());
		
		return "student-confirmation";
	}
}
