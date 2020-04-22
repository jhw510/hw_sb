package com.hw.web.lotto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hw.web.member.Member;
import com.hw.web.util.LottoResult;

@RestController
@RequestMapping("/lotto")
public class LottoController {

	@Autowired LottoService lottoService;
	
 @GetMapping ("/report/{userid}")
 public LottoResult report(@PathVariable String userid) {
	 return lottoService.detail(userid);
 }
 @GetMapping("/detail")
 public Lotto detail(@RequestBody String userid) {
	 Lotto returnDetail = new Lotto();
	 lottoService = new LottoServiceImpl();
	 lottoService.detail(userid);
	 return returnDetail;
 }
 @GetMapping("/count")
	public int count (@RequestBody String userid) {
		int count = 0;
		return count;
	}
 
}
