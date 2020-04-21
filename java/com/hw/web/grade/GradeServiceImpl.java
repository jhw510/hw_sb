package com.hw.web.grade;

import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
	
	private Grade[] grades;
	private int count;
	
	public GradeServiceImpl() {
		grades = new Grade[4];
		count=0;
	}
	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;
	}

	@Override
	public Grade[] list(Grade grade) {
	
		return grades;
	}

	@Override
	public Grade detail(Grade grade) {
		
		return null;
	}

	@Override
	public int count() {
		
		return count;
	}
	@Override
	public String total(Grade grade) {
	
		return grade.getKorean()+grade.getEnglish()+grade.getMath();
	}
	@Override
	public String average(Grade grade) {
		
		return null ;
	}
	@Override
	public String record(Grade grade) {
		
		return null;
	}
	@Override
	public String ranking() {
		
		return null;
	}

	@Override
	public void update(Grade grade) {
		
	}

	@Override
	public void delete(Grade grade) {
	
	}

}
