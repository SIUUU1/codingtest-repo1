package level1;

public class Test8 {
	class Solution {
		// x만킄 간격이 있는 n개의 숫자
		// 함수 solution은 정수 x와 자연수 n을 입력 받아,
		// x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
		public long[] solution(long x, int n) {	
			long[] answer = new long[n];
			for (int i = 0; i < n; i++) {
				answer[i] = (i + 1) * x;	//x부터 시작해야 하기 때문에 i+1 에 x를 곱하였다.
			}
			return answer;
		}
	}
}
