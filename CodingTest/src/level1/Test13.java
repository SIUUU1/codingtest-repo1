package level1;

import java.util.Arrays;
import java.util.Comparator;

public class Test13 {
	// 정수 내림차순으로 배치하기
	// 함수 solution은 정수 n을 매개변수로 입력받습니다.
	// n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
	// 예를들어 n이 118372면 873211을 리턴하면 됩니다.
	class Solution {
		public long solution(long n) {
			String num = "" + n; // 정수를 문자열로 변환
			String[] arr = num.split(""); // split를 사용하여 한자리씩 배열에 넣는다.
			StringBuilder sb = new StringBuilder();
			Arrays.sort(arr, Comparator.reverseOrder()); // desc로 정렬한다.
			for (String data : arr) {
				sb.append(data); // 배열을 문자열로 변환
			}
			return Long.parseLong(sb.toString()); // 문자열을 정수로 변환
		}
	}
}
