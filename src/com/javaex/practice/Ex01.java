package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for(int i=0; i< intArray.length; i++) { //i<=intArray.lenght부분에서 =가 있기때문에 3번째 값까지 반환하려고 하지만 
												//3번째 값은 존재하지 않기 때문에 오류가 발생한다.
			result = result + intArray[i];
		}
		System.out.println(result);

	}

}
//22
