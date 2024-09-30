package level1;

import java.util.HashSet;
import java.util.Set;

//두개 뽑아서 더하기
public class Test42 {
	class Solution {
		public int[] solution(int[] numbers) {
			Set<Integer> set = new HashSet<>();

			for (int i = 0; i < numbers.length; i++) {
				for (int j = i + 1; j < numbers.length; j++) {
					int sum = numbers[i] + numbers[j];
					set.add(sum);
				}
			}

			return set.stream().sorted().mapToInt(Integer::intValue).toArray();
		}
	}
}
