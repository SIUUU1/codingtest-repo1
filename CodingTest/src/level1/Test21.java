package level1;

//최소직사각형
//모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다. 
//모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.
public class Test21 {

	public int solution1(int[][] sizes) {
		int w = 0; // 가로세로 둘 중에 작은 수 중에 가장 큰 수
		int h = 0; // 가로세로 둘 중에 큰 수 중에 가장 큰 수
		for (int i = 0; i < sizes.length; i++) {
			if (sizes[i][0] <= sizes[i][1]) {
				if (w < sizes[i][0]) {
					w = sizes[i][0];
				}
				if (h < sizes[i][1]) {
					h = sizes[i][1];
				}
			} else {
				if (h < sizes[i][0]) {
					h = sizes[i][0];
				}
				if (w < sizes[i][1]) {
					w = sizes[i][1];
				}
			}
		}
		return w * h;
	}

	// Math 함수 사용하기
	public int solution2(int[][] sizes) {
		int w = 0, h = 0;
		for (int[] card : sizes) {
			w = Math.max(w, Math.max(card[0], card[1]));
			h = Math.max(h, Math.min(card[0], card[1]));
		}
		return w * h;
	}
}
