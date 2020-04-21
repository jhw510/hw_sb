package com.hw.web.grade;

public interface GradeService {
	public void add(Grade grade);
	public Grade[] list(Grade grade);
	public Grade detail (Grade grade);
	public int count();

	public String total(Grade grade);
	public String average(Grade grade);
	public String record(Grade grade);
	public String ranking() ;
	
	public void update(Grade grade);
	public void delete(Grade grade);

}
