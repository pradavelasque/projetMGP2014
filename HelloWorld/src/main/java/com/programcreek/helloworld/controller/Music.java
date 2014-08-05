package com.programcreek.helloworld.controller;

import java.io.File;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import outils.OutilsFile;

@Controller
public class Music {

	final String nameDirectory = "C:\\Users\\Public\\Music\\Sample Music";
	
	@RequestMapping("/Music")
	public ModelAndView showNameMusic(@RequestParam(value = "name", required = false, defaultValue = "World") String name){
		System.out.println("Music");
		List<String> musicNames = OutilsFile.getNamesMusic(nameDirectory);
		
		ModelAndView mv = new ModelAndView("Music");
		mv.addObject("message1", "as");
		mv.addObject("name1", "asdsd");
		mv.addObject("lists",musicNames);	
		
		OutilsFile.listFolder(name);
		
		return mv;
	}
	

}
