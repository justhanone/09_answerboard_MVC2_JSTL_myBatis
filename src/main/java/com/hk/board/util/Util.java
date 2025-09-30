package com.hk.board.util;

//Action Tag: <userbean/> -> 주로 DTO 객체를 사용
//			  <setproperty> : dto의 setter 메서드 호출
//			  <getproperty> : dto의 getter 메서드 호출
public class Util {
	
	private String arrowNbsp; //공백+화살표 이미지를 저장할 것

	public String getArrowNbsp() {
		return arrowNbsp;
	}

	//"&nbsp;&nbsp;&nbsp;<img src='img/arrow.png' />" 이런식으로 만들려고 함
	public void setArrowNbsp(String depth) {
		String nbsp=""; //공백을 나타낼 문자열
		
		int depthInt=Integer.parseInt(depth);
		for (int i = 0; i < depthInt; i++) {
			nbsp+="&nbsp;&nbsp;&nbsp;&nbsp;";
		}
		
		this.arrowNbsp = nbsp+(depthInt>0?"<img src='img/arrow.png' width='15px' height='15px'/>":"");
	}
}
