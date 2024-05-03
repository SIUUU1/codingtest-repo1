package level1;

public class Test5 {
	// 없는 숫자 구하
	// 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
	// numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
	int solution(int[] numbers, int numbers_len) {
		int answer = 0;
		for (int i = 0; i < 10; i++) {
			int num = -1;
			for (int j = 0; j < numbers_len; j++) {
				if (numbers[j] == i) {
					num = i;
					break;
				}
			}
			if (num != -1) {
				answer += num;
			}
		}
		return 45 - answer;
	}

}
