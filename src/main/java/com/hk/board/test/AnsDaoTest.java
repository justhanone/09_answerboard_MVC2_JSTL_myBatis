package com.hk.board.test;

import java.util.List;
import com.hk.board.dao.AnsDao;
import com.hk.board.dto.AnsDto;

public class AnsDaoTest {

	public static void main(String[] args) {
		
		AnsDao dao=new AnsDao();
		List<AnsDto> list=dao.getAllList(pnum);		
		
		
		System.out.println(list);
	}

}
