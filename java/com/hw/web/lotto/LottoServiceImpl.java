package com.hw.web.lotto;

import org.springframework.stereotype.Service;

import com.hw.web.util.LottoResult;

@Service
public class LottoServiceImpl implements LottoService {
	private Lotto[] lottos;
	private int count;

	public LottoServiceImpl() {
		lottos = new Lotto[6];
		count = 0;
	}

	@Override
	public void add(Lotto lotto) {
		lottos[count] = lotto;
		count++;

	}

	private int[] lotto (Lotto lotto) {
		int[] lottoNum = new int[6];
		int lot;

		for (int i = 0; i < count; i++) {
			lot = (int) (Math.random() * 45) + 1;
			System.out.println(lot);
			lottoNum[i] = lot;
			for(int j = 0;j<i;j++) {
				if(lottoNum[i] == lot ) {
					--i;
					
					break;
				}
			}

			}
		return lottoNum;
		}
	

	@Override
	public Lotto[] list(String userid) {
		return lottos;
	}

	@Override
	public int count() {

		return count;
	}

	@Override
	public LottoResult detail(String number) {
		LottoResult returnDetail =null;
		int returnCount =0;
		switch (returnCount) {
		case 7:
			returnDetail = returnDetail.A;
			break;
		case 6:
			returnDetail = returnDetail.A;
			break;
		case 5:
			returnDetail = returnDetail.B;
			break;
		case 4:
			returnDetail = returnDetail.C;
			break;
		case 3:
			returnDetail = returnDetail.D;
			break;
		default:
			returnDetail = returnDetail.F;
			break;

		}
		return returnDetail;

	}

	@Override
	public int countNumber(String number) {
		int returnCount =0;
		for (int i=0;i<count;i++) {
			if(number.equals(lottos[i].getNumber())) {
				returnCount++;
			}
		}
		return returnCount;
	}
}
