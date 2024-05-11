package level1;

import java.util.Arrays;

public class Test14 {
	// 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해
	// 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
	// s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
	class Solution {
		public String solution(String s) {
			char[] arr = s.toCharArray();	//문자열 char배열로 변환
			Arrays.sort(arr);	//오름차순으로 정렬
			StringBuilder sb = new StringBuilder(String.valueOf(arr));	
			sb.reverse();	//오름차순을 reverse함.
			return sb.toString();
		}
	}
}
