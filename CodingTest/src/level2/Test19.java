package level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//기능개발
public class Test19 {
	class Solution {
		public int[] solution(int[] progresses, int[] speeds) {
			int[] answer = {};

			Queue<Integer> q = new LinkedList<Integer>();

			// 기능 배포 시간
			int[] day = new int[progresses.length];

			for (int i = 0; i < day.length; i++) {
				if ((100 - progresses[i]) % speeds[i] == 0) {
					day[i] = (100 - progresses[i]) / speeds[i];
				} else {
					day[i] = ((100 - progresses[i]) / speeds[i]) + 1;
				}
				q.add(day[i]);
			}

			// 각 배포마다 기능개수 리스트
			List<Integer> list = new ArrayList<Integer>();

			int cnt = 0; // 기능 갯수
			int time = q.peek(); // 첫 기능이 배포되는데 걸리는 기간

			while (!q.isEmpty()) {

				if (q.peek() <= time) { // 배포에 걸리는 기간이 이전보다 같거나 짧을 때
					q.poll();
					cnt++;
				} else { // 다음 기능 배포가 더 길 때
					list.add(cnt);
					cnt = 1;
					time = q.poll();
				}
			}
			// 마지막 배포 추가
			list.add(cnt);

			answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}

			return answer;
		}
	}
}
