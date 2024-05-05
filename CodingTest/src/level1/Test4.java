package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test4 {
	// 나누어 떨어지는 숫자 배열 반환하기
	class Solution1 {
		public int[] solution(int[] arr, int divisor) {
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % divisor == 0) { //나누어 떨어지는 수를 list에 넣는다.
					list.add(arr[i]);
				}
			}
			if (list.isEmpty()) {	//list가 비어있다면 -1을 넣는다.
				list.add(-1);
			}
			Collections.sort(list);	//오름차순 정렬
			Integer[] integerArr = list.toArray(new Integer[list.size()]); 
			return Arrays.stream(integerArr).mapToInt(Integer::intValue).toArray(); //list를 int 배열로 바꿈
		}
	}

	class Solution2 {
		public int[] solution(int[] arr, int divisor) {
			int[] answerArr = Arrays.stream(arr)
					.filter(e -> e % divisor == 0)	//나누어 떨어지는 수 필터
					.sorted()	//오름차순 정렬
					.toArray();	//배열로 바꿈
			if (answerArr.length == 0) {
				answerArr[0] = -1;	//answerArr 비어있다면 -1을 넣어 반환한다.
			}
			return answerArr;
		}
	}
}
