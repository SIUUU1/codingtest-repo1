package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//문자열 내 마음대로 정렬하기
//문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 
//각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
//예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 
//각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
public class Test27 {
	class Solution {
		public String[] solution(String[] strings, int n) {
			String[] answer = null;
			List<String> list = new ArrayList<String>();
			for (String s : strings) {
				list.add(s.charAt(n) + s);
			}
			Collections.sort(list);
			answer = new String[list.size()];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i).substring(1);
			}

			return answer;
		}
	}
}
