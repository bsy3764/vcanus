package ch05;

// 5시간 39분 소요
public class Pond {

	public static void main(String[] args) {
		
		// 지도 만들기
		int[][] arr;
		arr = new int[10][10];
		
		// 배열을 모두 1로 초기화
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				arr[i][j] = 1;
			}
		}
		
		for(int i = 1; i < 4; i++) {
			for(int j = 4 - i; j > 0; j--) {
				arr[i][j] = 0;
			}
		}
		
		for(int i = 1; i < 4; i++) {
			for(int j = 4 + i; j < 9; j++) {
				arr[i][j] = 0;
			}
		}
		
		int a = 2;
		for(int i = 6; i < 9; i++) {
			for(int j = 1; j < 4 - a; j++) {
				arr[i][j] = 0;
			}
			a--;
		}
		
		int b = 2;
		for(int i = 6; i < 9; i++) {
			for(int j = 8; j > 5 + b ; j--) {
				arr[i][j] = 0;
			}
			b--;
		}
		
		for(int i = 0; i < 10; i++) {
			if(i == 0 || i == 9) {
				for(int j = 0; j < 10; j++) {
					arr[i][j] = 0;
				}
			}
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == 0 || j == 9) {
					arr[i][j] = 0;
				}
			}
		}
		
		arr[3][1] = 1;
		arr[8][5] = 0;
		
		// 출력
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		
		// 깊이 계산
		for(int k = 0; k < 10; k++) {
			for(int i = 1; i < 9; i++) {
				for(int j = 1; j < 9; j++) {
					int now = arr[i][j];
					int up = arr[i - 1][j];
					int down = arr[i + 1][j];
					int right = arr[i][j + 1];
					int left = arr[i][j - 1];
					
					if(now != 0) {
						if(now <= up && now <= down && now <= right && now <= left) {
							arr[i][j] += 1;
						}
					}
				}
			}
		}
		
		
		// 출력
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		
		// 연못 물 깊이의 총 합
		int total = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				total += arr[i][j];
			}
		}
		System.out.printf("연못 물 깊이의 총 합 : %d", total);
	}

}


/*
0 0 0 0 0 0 0 0 0 0
0 0 0 0 1 0 0 0 0 0
0 0 0 1 1 1 0 0 0 0
0 1 1 1 1 1 1 0 0 0
0 1 1 1 1 1 1 1 1 0
0 1 1 1 1 1 1 1 1 0
0 0 1 1 1 1 1 1 0 0
0 0 0 1 1 1 1 0 0 0
0 0 0 0 1 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
*/