package ch01;

public class BreadRecipe {
	// ��ü�� ���� ��, ��ȯ
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
