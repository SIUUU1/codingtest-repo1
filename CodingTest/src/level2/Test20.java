package level2;

import java.util.HashMap;
import java.util.Map;

//전화번호 목록
public class Test20 {
	class Solution {
		public boolean solution(String[] phone_book) {
			boolean answer = true;
			Map<String, Integer> map = new HashMap<>();

			for (int i = 0; i < phone_book.length; i++)
				map.put(phone_book[i], i);

			// 모든 전화번호의 substring이 HashMap에 존재하는지 확인
			for (int i = 0; i < phone_book.length; i++) {
				for (int j = 0; j < phone_book[i].length(); j++) {
					if (map.containsKey(phone_book[i].substring(0, j))) {
						answer = false;
						break;
					}
				}
			}

			return answer;
		}
	}
}
