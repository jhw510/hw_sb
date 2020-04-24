package com.hw.web.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService{
	private Map<String, Object> map;
	
	
	public UserServiceImpl () {
		map= new HashMap<>();
		
	}
	
	
	@Override
	public void add(User user) {
	map.put(user.getUserid(), user);
		
	}

	@Override
	public User[] list(User user) {
	
		return null;
	}

	@Override
	public User detail(String userid) {
		System.out.println("서비스 detail 들어온 id: "+userid);
		User t = (User) map.get(userid);
		System.out.println("===============> "+t);
		return t;
	}

	@Override
	public int count() {
		
		return map.size();
	}
	@Override
	public User login(User user) {
		User returnUser = null;
		if(map.containsKey(user.getUserid())) {
		User u = detail(user.getUserid());	
		if(user.getPasswd().equals(u.getPasswd())) {
			returnUser=u;
			
		}
		}
		return returnUser;
	}

	@Override
	public boolean  update(User user) {
		
		map.replace(user.getUserid(), user);
		return true;
		
	}

	@Override
	public void delete(User user) {
		
		
	}


	@Override
	public boolean remove(String userid) {
		map.remove(userid);
		return true;
	}



}
