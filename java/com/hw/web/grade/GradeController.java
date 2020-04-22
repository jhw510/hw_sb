package com.hw.web.grade;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hw.web.util.Credit;
import com.hw.web.util.Messenger;
@RestController
@RequestMapping("/grade")
public class GradeController {
	@Autowired GradeService gradeService;  // Autowired  는 new GradeService 
	
	

	@PostMapping("/register")
	public Messenger register (@RequestBody Grade grade) {
	System.out.println("register 들어옴");
		Messenger messenger = null;
		int current = gradeService.count();
		gradeService.add(grade);
//		if(gradeService.count() == current +1) {
//			messenger = messenger.SUCCESS;
//		}                        성공과 실패를 한줄료 표현하려고 아래처럼 만듦
		return(gradeService.count() == current +1)? messenger.SUCCESS
				:Messenger.FAIL;
	}

	@GetMapping("/report/{userid}")
	public Credit report(@PathVariable String userid) {

		return gradeService.detail(userid) ;
	}
}
	

	
//	
//	@PostMapping("/report")
//	public Credit report(@RequestBody Grade grade) {
//		Grade returnTotal = new Grade();
//		
//		
//		return Integer.parseInt(returnTotal) ;
//	}



















//	@GetMapping("/detail")
//	public Grade[] datail(@RequestBody String grade ) {
//		Grade[] returnDetail = new Grade [5];
//		gradeService = new GradeServiceImpl()	;
//		
//		gradeService.detail(grade);
//		return returnDetail;
//	}
//	@GetMapping("/list")
//	public Grade[] list(@RequestBody Grade grade) {
//		Grade[] returnList = new Grade[4];
//		return returnList;
//	}
//	@PostMapping("/total")
//	public Grade total(@RequestBody Grade grade) {
//		Grade returnTotal = new Grade();
//		return returnTotal;
//	
//	}
//	@PostMapping("/average")
//	public Grade average(@RequestBody Grade grade) {
//		Grade returnAverage = new Grade();
//		
//		return returnAverage;
//	}
//		@GetMapping("/count")
//	public int count (@RequestBody Grade grade) {
//		int count = 0;
//		return count;
//	
//	}
//	@PutMapping("/update")
//	public Grade update(@RequestBody Grade grade) {
//		Grade returnUpdate = new Grade ();
//		return returnUpdate;
//	}
//	@DeleteMapping("/delete")
//	public Grade delete (@RequestBody Grade grade) {
//		Grade returnGrade = new Grade();
//		return	 returnGrade;
//	}



