package level2;

// 카펫
// Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 
// 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
// Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 
// 전체 카펫의 크기는 기억하지 못했습니다.
// Leo가 본 카펫에서 갈색 격자의 수 brown, 
// 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 
// 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
public class Test9 {
	class Solution {
		public int[] solution(int brown, int yellow) {
			for (int w = 3; w <= 5000; w++) {
				for (int h = 3; h <= w; h++) {
					
					int boundary = (w + h - 2) * 2;
					int center = w * h - boundary;

					if (brown == boundary && yellow == center) {
						return new int[] { w, h };
					}
				}
			}
			return null;
		}
	}
}
