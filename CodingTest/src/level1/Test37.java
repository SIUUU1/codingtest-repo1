package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//명예의 전당
public class Test37 {
	class Solution {
		public int[] solution(int k, int[] score) {
			int[] answer = new int[score.length];

			List<Integer> rank = new ArrayList<>();

			for (int i = 0; i < score.length; i++) {

				rank.add(score[i]);

				// rank 리스트의 크기가 k보다 크면 가장 낮은 점수 제거
				if (rank.size() > k) {
					rank.remove(Collections.min(rank));
				}

				// answer에 남은 점수 중 가장 작은 점수 넣기
				answer[i] = Collections.min(rank);
			}
			
			return answer;

		}
	}
}
