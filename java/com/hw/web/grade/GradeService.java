package com.hw.web.grade;

import org.springframework.web.bind.annotation.PathVariable;

import com.hw.web.util.Credit;

public interface GradeService {
	public void add(Grade grade);
	public Credit detail (String userid);
	public int count();
//	public Credit report(String userid);
//	public Grade[] list(Grade grade);
//	public Grade register(Grade grade);
//	public int total(String userid);
//	public int average(Grade grade);
//	
//	public Grade[] register(Grade grade);
//	
//	public void update(Grade grade);
//	public void delete(Grade grade);

}
