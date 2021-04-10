package ch01;

public class Cream implements Bread {
	int flour;
	int water;
	int cream;

	@Override
	public void recipeInfo() {
		System.out.printf("breadType: cream\n"
				+ "recipe\n"
				+ "flour: %d\n"
				+ "water: %d\n"
				+ "cream: %d", flour, water, cream);
	}

	@Override
	public void recipe(int flour, int water, int etcCount) {
		this.flour = flour;
		this.water = water;
		this.cream = etcCount;
	}
	
}
