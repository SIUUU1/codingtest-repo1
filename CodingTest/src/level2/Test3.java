package level2;

public class Test3 {
	class Solution {
		// JadenCase문자열 만들기
		// JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은
		// 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는
		// 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
		// 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을
		// 리턴하는 함수, solution을 완성해주세요.
		public String solution1(String s) {
			String[] arr = s.toLowerCase().split(""); // 모두 소문자로 변환
			String answer = arr[0].toUpperCase(); // 첫문자는 대문자
			for (int i = 1; i < arr.length; i++) {
				if (arr[i].equals(" ")) {
					if (i != arr.length - 1) { // 마지막 글자가 공백일 경우, 글자를 추가하지 않기 위해서
						arr[i + 1] = arr[i + 1].toUpperCase(); // 공백 다음은 대문자
					}
				}
				answer += arr[i];
			}
			return answer;
		}

		public String solution2(String s) {
			String answer = "";
			String[] arr = s.split(" ");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].length() == 0) {
					answer += " "; // 문자가 없을 경우 공백
				} // 문자가 있다면
				else {
					answer += arr[i].substring(0, 1).toUpperCase();
					answer += arr[i].substring(1, arr[i].length()).toLowerCase();
					answer += " ";
				}
			}
			if (s.substring(s.length() - 1, s.length()).equals(" ")) {
				return answer;
			}
			// 맨 마지막 " " 제거 후 반환
			return answer.substring(0, answer.length() - 1);
		}

	}
}
