package level1;

public class Test9 {
	// 두 정수 사이의 합
	// 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수,
	// solution을 완성하세요.
	// 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
	class Solution {
		public long solution(int a, int b) {
			long answer = 0;
			if (a < b) {
				for (int i = a; i <= b; i++) { // a < b일 때
					answer += i; // a와 b 사이에 속한 모든 정수의 합
				}
			} else {
				for (int i = b; i <= a; i++) { // a >= b일 때
					answer += i; // a와 b 사이에 속한 모든 정수의 합
				}
			}
			return answer;
		}
	}
	class Solution2 {
		public long solution(int a, int b) {
			return sumAtoB(Math.min(a, b), Math.max(a, b));	
		}
		//sumAtoB함수
		private long sumAtoB(long x, long y) {	
			return (y - x + 1) * (x + y) / 2;	//등차수열 합의 공식
		}
	}
}
