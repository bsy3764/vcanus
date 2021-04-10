package ch01;

public class Sugar implements Bread {
	int flour;
	int water;
	int sugar;

	@Override
	public void recipeInfo() {
		System.out.printf("breadType: sugar\n"
				+ "recipe\n"
				+ "flour: %d\n"
				+ "water: %d\n"
				+ "sugar: %d", flour, water, sugar);
	}

	@Override
	public void recipe(int flour, int water, int etcCount) {
		this.flour = flour;
		this.water = water;
		this.sugar = etcCount;
	}


}
