package ch01;

public class Butter implements Bread {
	int flour;
	int water;
	int butter;

	public void testButter() {
		System.out.println("Butter call");
	}

	@Override
	public void recipe(int flour, int water, int etcCount) {
		this.flour = flour;
		this.water = water;
		this.butter = etcCount;
	}

	@Override
	public void recipeInfo() {
		System.out.printf("breadType: butter\n"
				+ "recipe\n"
				+ "flour: %d\n"
				+ "water: %d\n"
				+ "butter: %d", flour, water, butter);		
	}


}
