package level2;

import java.util.Arrays;

public class Test1 {
	// 최댓값과 최솟값
	// 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
	// str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를
	// "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
	// 예를 들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고,
	// "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
	class Solution1 {
		public String solution(String s) {
			String[] arr = s.split(" ");
			int maxNum = Arrays.asList(arr).stream().mapToInt(Integer::parseInt).max().orElse(0);
			int minNum = Arrays.asList(arr).stream().mapToInt(Integer::parseInt).min().orElse(0);
			return minNum + " " + maxNum;
		}
	}
	class Solution2 {
		public String solution(String s) {
			int maxNum = Integer.MIN_VALUE;
			int minNum = Integer.MAX_VALUE;
			for (String str : s.split(" ")) {
				maxNum = Math.max(Integer.parseInt(str), maxNum);
				minNum = Math.min(Integer.parseInt(str), minNum);
			}
			return minNum + " " + maxNum;
		}
	}
}
