package com.hw.web.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/grade")
public class GradeController {
	@Autowired GradeService gradeService;
	
	@PostMapping("/register")
	public Grade add(@RequestBody Grade grade) {
	
		gradeService.add(garde);
	
	}
	@PostMapping("/total")
	public Grade total(@RequestBody Grade grade) {
		
		return null;
	}
	@PostMapping("/average")
	public Grade average(@RequestBody Grade grade) {
		return null;
	}
	
}
