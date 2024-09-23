package level2;

import java.util.Collections;
import java.util.PriorityQueue;

//프로세스
public class Test22 {
	class Solution {
		public int solution(int[] priorities, int location) {
			int answer = 0;
			PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

			for (int num : priorities) {
				priorityQueue.add(num);
			}
			while (!priorityQueue.isEmpty()) {
				for (int i = 0; i < priorities.length; i++) {
					if (priorities[i] == priorityQueue.peek()) {
						priorityQueue.poll();
						answer++;
						if (i == location)
							return answer;
					}
				}
			}
			return answer;
		}
	}
}
