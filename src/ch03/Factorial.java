package ch03;

import java.util.Scanner;

// 3번 17분 소요
public class Factorial {

	public static void main(String[] args) {
		
		// 4번(30분 소요)
		// 입력값을 체크하는 조건문을 사용 <- 처음 떠오른 생각
		// 검색해본 결과 '꼬리 재귀 호출'을 사용
		int result = factorial(4);
		System.out.println(result);
	}
	
	private static int factorialTail(int num, int acc){
		if(num == 1) {
			return acc;
		}
	    return factorialTail(num - 1, acc * num);
	}
	
	private static int factorial(int num){
	    return factorialTail(num, 1);
	}

//	private static int factorial(int num) {
//		if(num == 1) {
//			return num;
//		}
//		else {
//			return ( factorial(num - 1) * num );
//		}
//	}

}
