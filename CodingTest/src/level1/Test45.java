package level1;

//[1차]비밀지도
public class Test45 {
	class Solution {
		public String[] solution(int n, int[] arr1, int[] arr2) {
			String[] answer = new String[n];

			for (int i = 0; i < n; i++) {

				answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
				answer[i] = String.format("%" + n + "s", answer[i]);
				answer[i] = answer[i].replace("1", "#");
				answer[i] = answer[i].replace("0", " ");

			}

			return answer;
		}
	}
}
