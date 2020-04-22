package com.hw.web.grade;

import org.springframework.stereotype.Service;

import com.hw.web.util.Credit;

@Service
public class GradeServiceImpl implements GradeService {
	
	private Grade[] grades;  //저장소 공개되면 안되니까 private
	private int count;
	
	public GradeServiceImpl() {
		grades = new Grade[5];
		count=0;
	}
	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;
	}
	@Override
	public int count() {
		
		return count;
	}


	@Override
	public Credit detail(String userid) {
		Credit credit =null;
		switch(avg(userid)/10){
		case 10 : case 9 : credit = credit.A;break;
		case 8 : credit = credit.A;break;
		case 7 : credit = credit.B;break;
		case 6 : credit = credit.C;break;
		case 5 : credit = credit.D;break;
		default :credit = credit.F;break;
		
		}
		return credit;
	}
	private int avg(String userid) {
		
		return total(userid)/4;
	}
	


	private int total (String userid) {
		int total = 0;
		for(int i=0;i<count;i++) {
			if(userid.equals(grades[i].getUserid())) {
				total = Integer.parseInt(grades[i].getKorean())
						+Integer.parseInt(grades[i].getEnglish())
						+Integer.parseInt(grades[i].getMath())
						+Integer.parseInt(grades[i].getJava());
			}
		}
		System.out.println("total score : "+total);
		return total;
	}
}
//	@Override
//	public Grade[] list(Grade grade) {
//		
//		return grades;
//	}
//	@Override
//	public Grade[] register(Grade grade) {
//		
//		return null;
//	}
//	
//
//	@Override
//	public int average(Grade grade) {
//		
//		return total(grade) / 4;
//	}
//
//
//	
//	
//	@Override
//	public void update(Grade grade) {
//		
//	}
//
//	@Override
//	public void delete(Grade grade) {
//	for(int i = 0; i<count ;i++) {
//		if (grade.getUserid().equals(grades[i].getUserid()));
//				
//	}
//	}
//	@Override
//	public Credit report(String userid) {
//	
//		return null;
//	}

