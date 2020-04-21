package com.hw.web.member;

public interface MemberService {
public void add(Member member);
public Member[] list(Member member);
public Member detail (String userid);
//public Member[] searchByName(String name);  
public int count();
//public int count(String name);
public boolean login (Member member);
public void update(Member member);
public void delete(Member member);



}
