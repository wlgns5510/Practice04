package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double average=0;
		int count=0;
		double[] score = new double[5];
		score[0] = sc.nextInt();
		score[1] = sc.nextInt();
		score[2] = sc.nextInt();
		score[3] = sc.nextInt();
		score[4] = sc.nextInt();
		
		for(int i=0; i<score.length; i++) {
			count++;
			average += score[i];
			
		}
		System.out.println("평균은 " + average/count + " 입니다.");
		
		sc.close();

	}

}
