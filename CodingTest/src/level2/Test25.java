package level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//롤케이크 자르기
public class Test25 {
	class Solution {
		public int solution(int[] topping) {
			int answer = 0;
			Map<Integer, Integer> map = new HashMap<>();
			Set<Integer> set = new HashSet<>();

			for (int t : topping) {
				if (map.containsKey(t)) {
					map.put(t, map.get(t) + 1);
				} else {
					map.put(t, 1);
				}
			}

			for (int t : topping) {
				map.put(t, map.get(t) - 1);
				set.add(t);
				if (map.get(t) == 0) {
					map.remove(t);
				}
				if (map.size() == set.size()) {
					answer++;
				}
			}
			return answer;
		}
	}
}
