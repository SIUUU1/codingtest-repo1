package level2;

import java.util.Arrays;

public class Test2 {
	// 최솟값 만들기
	// 길이가 같은 배열 A, B 두개가 있습니다. 각 배열은 자연수로 이루어져 있습니다.
	// 배열 A, B에서 각각 한 개의 숫자를 뽑아 두 수를 곱합니다. 이러한 과정을
	// 배열의 길이만큼 반복하며, 두 수를 곱한 값을 누적하여 더합니다.
	// 이때 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다.
	// (단, 각 배열에서 k번째 숫자를 뽑았다면 다음에 k번째 숫자는 다시 뽑을 수 없습니다.)
	class Solution {
		public int solution(int[] A, int[] B) {
			int answer = 0;
			Arrays.sort(A); // 오름차순 정렬
			Arrays.sort(B);	// 오름차순 정렬
			for (int i = 0; i < A.length; i++) {
				answer += A[i] * B[A.length - i - 1];	//A[]의 최솟값과 B[]최댓값을 순서대로 곱하여 더한다.
			}
			return answer;
		}
	}
}
