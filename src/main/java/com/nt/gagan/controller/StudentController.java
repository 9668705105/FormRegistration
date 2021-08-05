package com.nt.gagan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.gagan.bindings.StudentBinding;
import com.nt.gagan.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService sds;
	
	@GetMapping("/loadform")
	public String loadRegdForm(Model model) {
		model.addAttribute("genders",sds.getGenders());
		model.addAttribute("courses",sds.getCourses());
		model.addAttribute("timings",sds.getTimings());
		
		StudentBinding sobj=new StudentBinding();
		model.addAttribute("student",sobj);
		return "index";
	}
	
	@PostMapping("/saveStudent")
	public String handleRegButtonClick(StudentBinding student,Model model) {
	       System.out.println(student);
	       
	       model.addAttribute("msg","Student Registration Successfull...");
	       return "dashboard";
		
	}

}
