package level1;

import java.util.stream.IntStream;

public class Test3 {
	// 나머지가 1되는 가장 작은 수 찾기
	class Solution1 {
		public int solution(int n) {
			int x = 0;
			for (int i = 1; i < n; i++) {
				if (n % i == 1) {
					x = i;
					break;
				}
			}
			return x;
		}
	}
	// stream 이용하기
	class Solution2 {
		public int solution(int n) {
			return IntStream.range(2, n).filter(e -> n % e == 1).findFirst().getAsInt();
		}
	}
}
