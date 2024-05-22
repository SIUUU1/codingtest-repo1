package level1;

import java.util.Arrays;

public class Test16 {
	// 가장 작은수 제거하기
	// 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수,
	// solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에
	// -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를
	// 리턴 하고, [10]면 [-1]을 리턴 합니다.
	class Solution1 {
		public int[] solution(int[] arr) {
			int[] answer = null;
			// 무조건 원소 1개 제거해야 하기 때문에 int[]{-1}을 리턴한다.
			if (arr.length == 1) {
				answer = new int[] { -1 };
			} else {
				int min = Arrays.stream(arr).min().getAsInt(); // 최솟값 구하기
				answer = new int[arr.length - 1];
				int index = -1;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == min) {
						index = i;	//최솟값일 때 인덱스 값 저장
						break;
					} else {
						answer[i] = arr[i];
					}
				}
				for (int j = index; j < answer.length; j++) {
					answer[j] = arr[j + 1];	//최솟값일 때의 인덱스부터 값을 넣어준다. 
				}
			}
			return answer;
		}
	}
	//stream
	class Solution2 {
		public int[] solution(int[] arr) {
			if (arr.length <= 1)
				return new int[] { -1 };
			int min = Arrays.stream(arr).min().getAsInt();
			return Arrays.stream(arr).filter(i -> i != min).toArray(); //filter을 이용해서 최솟값이 아닌 값만 배열로 반환함
		}
	}

}
