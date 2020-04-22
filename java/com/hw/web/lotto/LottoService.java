package com.hw.web.lotto;

import com.hw.web.util.LottoResult;

public interface LottoService {
	public void add(Lotto lotto);
	public Lotto[] list(String userid);
	public int conut();
	
	public LottoResult detail(String userid);
	
}
