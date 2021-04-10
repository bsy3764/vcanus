package ch01;

public class BreadRecipe {
	// 객체를 생성 후, 반환
	public Bread MakeBread(String breadType) {
		if(breadType.equalsIgnoreCase("cream")) {
			return new Cream();
		}
		
		if(breadType.equalsIgnoreCase("sugar")) {
			return new Sugar();
		}
		
		if(breadType.equalsIgnoreCase("butter")) {
			return new Butter();
		}
		
		return null;
	}
}
