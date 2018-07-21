package com.anir.springdemo.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/entry")
public class EntryController {

	@RequestMapping("/show")
	public String showEntryName(){
		return "show-entry";
	}
	
	
	@RequestMapping("/process")
	public String processEntryName(){
		return "process-entry-form";
	}
	
	//New method for process data with Model
	@RequestMapping("/processV2")
	public String processEntryName(HttpServletRequest request, Model model){
		//Read from HttpServlet Request
		String entryName = request.getParameter("EntryName");
		entryName = entryName.toUpperCase();
		
		String fullName = " Master " + entryName; 
		
		//Pass it to the model
		model.addAttribute("EntryName",fullName);
		
		return "process-entry-form2";
	}
	
	@RequestMapping("/processV3")
	public String processEntryName(@RequestParam("EntryName") String entryName, Model model){

		entryName = entryName.toUpperCase();
		
		String fullName = " Mr. " + entryName; 
		
		//Pass it to the model
		model.addAttribute("EntryName",fullName);
		
		return "process-entry-form2";
	}
}
