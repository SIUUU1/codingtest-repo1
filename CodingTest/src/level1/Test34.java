package level1;

import java.util.HashSet;

//폰켓몬
public class Test34 {
	class Solution {
		public int solution(int[] nums) {
			int answer = nums.length / 2;

			HashSet<Integer> set = new HashSet<>();

			for (int num : nums) {
				set.add(num);
			}

			return set.size() > answer ? answer : set.size();
		}
	}
}
