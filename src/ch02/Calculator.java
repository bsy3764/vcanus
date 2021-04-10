package ch02;

public class Calculator {
	int result = 0;
	
	public Calculator add(int num) {
		this.result += num;
		return this;
	}
	
	public Calculator substract(int num) {
		this.result -= num;
		return this;
	}
	
	public int out() {
		int total = this.result;
		return total;
	}
	
}
