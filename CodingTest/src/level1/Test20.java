package level1;

public class Test20 {
	//콜라츠 추측
	//1-1. 입력된 수가 짝수라면 2로 나눕니다. 
	//1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다. 
	//2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다. 
	//위 작업을 몇 번이나 반복해야 하는지 반환하는 함수, solution을 완성해 주세요. 
	//단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 
	//–1을 반환해 주세요.
	class Solution {
		public int solution(long num) {
			int count = 0;	//작업 횟수
			while (num != 1) {
				++count;
				if (num % 2 == 0) {	//짝수일 때
					num = num / 2;
				} else {	//홀수일 때
					num = num * 3 + 1;
				}
				if (count > 500) {	//작업 500번 반복할때
					count = -1;
					break;
				}
			}
			return count;
		}
	}
}
