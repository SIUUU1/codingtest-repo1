package level1;

public class Test7 {
	// 약수의 개수와 덧셈
	// 두 정수 left와 right가 매개변수로 주어집니다.
	// left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
	// 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
	int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) { //left부터 right까지의 모든 수들
			int count = 0;	//count 값 초기화
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;	//i의 약수 갯수를 구한다.
				}
			}
			answer += (count % 2 == 0) ? (i) : (-i); //약수의 개수가 짝수인 수는 더하고,홀수이 뺀다.
		}
		return answer;
	}
}
