package ch02;

// 1시간 34분 소요
public class Calc extends Calculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result = cal.add(4).add(5).substract(3).out();
		System.out.println("result : " + result);
	}
	
}
