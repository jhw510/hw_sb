package com.hw.web.member;

public class MemberServiceImpl implements MemberService {
	private Member[] members;
	int count;
	
	public  MemberServiceImpl () {
		members = new Member[5];
		count = 0;
	}
	@Override
	public void add(Member member) {
		members[count] = new Member();
		count ++;
		
	}
	@Override
	public Member[] list() {
		
		return members;
	}
	@Override
	public Member detail(String userid) {
	Member returnDetail = null;
	 for(int i=0;i<count ;i++) {
		 if (userid.equals(members[i].getName())) {
			 returnDetail = members[i];
		 }
	 }
		return returnDetail;
	}
	@Override
	public Member[] searchByName(String name) {
		Member[]  returnName =null;
		int countName = count(name);
		if(count != 0) {
			returnName = new Member[count];
			int j = 0;
			for(int i =0;i<count ;i++) {
				if(name.equals(members[i].getName()))
					returnName [j] = members[i];
				j++;
				if(countName == j) {
					break;
				}
			}
		}
		return null;
	}
	@Override
	public int count() {
	
		return count;
	}
	@Override
	public int count(String name) {
		int returnCount= 0;
		for(int i=0;i<count;i++) {
			if(name.equals(members[i].getName())) {
				returnCount++;
			}
		}
		return returnCount ;
	}
	@Override
	public Member login(Member member) {
		Member returnLogin = null;
		for(int i =0; i<count;i++) {
			if(member.getName().equals(members[i].getName())) {
				returnLogin = members[i];
			}
		}
		return returnLogin;
	}
	@Override
	public void update(Member member) {
	
		for(int i=0;i<count ;i++) {
			if(member.getUserid().equals(members[i].getUserid())
					&& member.getPasswd().equals(members[i].getPasswd())) {
				members[i].setPasswd(member.getPasswd());
			}
		}
		
	}
	@Override
	public void delete(Member member) {
	 for (int i=0;i<count;i++) {
		 if (member.getUserid().equals(members[i].getUserid())
				 && member.getPasswd().equals(members[i].getPasswd())) {
			 members[count]=members[count-1];
			 members[count-1]=null;
			 count--;
			 
		 }
	 }
		
	}

	
}
