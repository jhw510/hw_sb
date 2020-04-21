package com.hw.web.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hw.web.util.Messenger;

@RestController
@RequestMapping("/member")
public class MemberController {
@Autowired MemberService memberService;
	
	
	@PostMapping("/join")
	public Messenger add(@RequestBody Member member) {
	int current = memberService.count();
	memberService.add(member);
//	Messenger result = null;
//	if(current == 1) {
//		result = Messenger.SUCCESS;
//	}else {
//		result = Messenger.FAIL;
//	}
//	return result;
	
	return (memberService.count()==(current+1))? Messenger.SUCCESS : Messenger.FAIL;
 }
	@PostMapping("/login")
	public Messenger login(@RequestBody Member member) {
		
//		int count =memberService.count();
//		Messenger result = null;
//		if(count == 1) {
//			result = Messenger.SUCCESS;
//		}else {
//			result = Messenger.FAIL;
//		}
//		return result;
	return (memberService.login(member))? Messenger.SUCCESS:Messenger.FAIL;
		
	}
	@GetMapping("/list")
	public Member[] list(@RequestBody Member member) {
		Member[] returnMember = new Member[5];
		
		return returnMember;
	}
	@GetMapping("/detail")
	public Member detail(@RequestBody String userid) {
		Member returnDetail = new Member();
		memberService = new MemberServiceImpl();
		memberService.detail(userid);
		return returnDetail;
	}
	
	@GetMapping("/count")
	public int count (@RequestBody Member member) {
		int count = 0;
		return count;
	}
	@PutMapping("/update")
	public Member update(@RequestBody Member member) {
		Member returnMember = new Member();
		return returnMember;
	}
	@DeleteMapping("/delete")
	public Member delete(@RequestBody Member member) {
		Member returnMember = new Member();
		return returnMember;
	}
}
