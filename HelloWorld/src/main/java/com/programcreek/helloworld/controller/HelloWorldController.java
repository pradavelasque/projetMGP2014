package com.programcreek.helloworld.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import outils.OutilsFile;

@Controller
public class HelloWorldController {

	final String message = "Welcome to Spring MVC!";
	final String nameDirectory = "C:\\Users\\Public\\Music\\Sample Music";
	
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");

		List<String> musicNames = OutilsFile.getNamesMusic(nameDirectory);
		
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		
		mv.addObject("lists",musicNames);	
		
		return mv;
	}

}
