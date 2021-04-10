package ch01;

import java.util.ArrayList;

// 2시간 17분 소요
public class BreadTest {

	public static void main(String[] args) {
		
		BreadRecipe bread1 = new BreadRecipe();
		
		Bread cream = bread1.MakeBread("cream");
		cream.recipe(100, 100, 200);
		
		Bread sugar = bread1.MakeBread("sugar");
		sugar.recipe(100, 50, 200);
		
		Bread butter = bread1.MakeBread("butter");
		butter.recipe(100, 100, 50);
				
		ArrayList<Bread> breadList = new ArrayList<>();
		breadList.add(cream);
		breadList.add(sugar);
		breadList.add(butter);
		
		for(Bread bread : breadList) {
			bread.recipeInfo();
			System.out.println();
			System.out.println();
		}
	}

}

/*
Bread 객체를 디자인 패턴 (팩토리 메소드)을 이용하여 JSON 생성

배열을 json으로 만들
[
{
  "breadType": "cream",
  "recipe": {
    "flour": 100,
    "water": 100,
    "cream": 200
  }
},
{
  "breadType": "sugar",
  "recipe": {
    "flour": 100,
    "water": 50,
    "sugar": 200
  }
},
{
  "breadType": "butter",
  "recipe": {
    "flour": 100,
    "water": 100,
    "butter": 50
  }
}
]
*/