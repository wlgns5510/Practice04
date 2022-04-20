package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		int num[] = new int[6];
		num[0] = (int)(Math.random()*45)+1;
		num[1] = (int)(Math.random()*45)+1;
		num[2] = (int)(Math.random()*45)+1;
		num[3] = (int)(Math.random()*45)+1;
		num[4] = (int)(Math.random()*45)+1;
		num[5] = (int)(Math.random()*45)+1;

		for(int i=0; i<num.length; i++) {
			
			for(int j=0; j<i; j++) {
				if(num[i] == num[j]) {
					i--;
				}
			}
		}
		for(int i=0; i<num.length; i++)
		System.out.print(num[i] + "  ");
			
		
	}

}
