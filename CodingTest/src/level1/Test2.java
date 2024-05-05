package level1;

public class Test2 {
	// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {	//n % i == 0일때 i는 n의 약수이다.
				answer += i;
			}
		}
		return answer;
	}
}
