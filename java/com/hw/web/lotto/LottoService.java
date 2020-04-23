package com.hw.web.lotto;

import com.hw.web.util.LottoResult;

public interface LottoService {
	public void add(Lotto lotto);
	public Lotto[] list(String userid);
	public int count();
	public int countNumber(String number);
	public LottoResult detail(String number);
	
}
