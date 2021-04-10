package ch03;

import java.util.Scanner;

// 3�� 17�� �ҿ�
public class Factorial {

	public static void main(String[] args) {
		
		// 4��(30�� �ҿ�)
		// �Է°��� üũ�ϴ� ���ǹ��� ��� <- ó�� ������ ����
		// �˻��غ� ��� '���� ��� ȣ��'�� ���
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
