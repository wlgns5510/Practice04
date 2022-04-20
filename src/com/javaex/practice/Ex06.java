package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		//첫줄
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]);
		}				
System.out.println("");		//줄바꿈을 위한 공백						
		//두번째줄
		for(int i=0; i<c.length; i++) {			
			if(c[i]==' ') {
				c[i] = ',';
			}			
			System.out.print(c[i]);
		}
		
		
	}

}
