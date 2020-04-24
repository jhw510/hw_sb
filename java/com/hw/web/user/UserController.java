package com.hw.web.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hw.web.util.Messenger;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/join")
	public Messenger join(@RequestBody User user) {
		System.out.println(user);
		int count = userService.count();
		userService.add(user);

		return (userService.count() == count + 1) ? Messenger.SUCCESS : Messenger.FAIL;
	}

	@PostMapping("/login")
	public Map<String, Object> login(@RequestBody User user) {
		Map<String, Object> returnMap = new HashMap<>();
		User loginedUser = userService.login(user);
		if (loginedUser != null) {
			returnMap.put("user", loginedUser);
			returnMap.put("messenger", Messenger.SUCCESS);
		} else {
			returnMap.put("messenger", Messenger.FAIL);
		}

		return returnMap;
	}

	@GetMapping("/detail/{userid}")
	public User detail(@PathVariable String userid) {
		System.out.println(" detail  들어온 id 진입 ;;;;;;;;" + userid);
		return userService.detail(userid);
	}

	@PutMapping("/update")
	public Messenger update(@RequestBody User user) {
		System.out.println(" 업데이트 정보 진입 ;;;;;;;;" + user);
		return (userService.update(user)) ? Messenger.SUCCESS : Messenger.FAIL;
	}

	@DeleteMapping("/remove/{userid}")
	public Messenger remove(@PathVariable String userid) {
		System.out.println(" delete정보 진입 ;;;;;;;;" + userid);
		return (userService.remove(userid)) ? Messenger.SUCCESS : Messenger.FAIL;

	}
}
