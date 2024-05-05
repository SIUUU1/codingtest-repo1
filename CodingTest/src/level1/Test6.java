package level1;

public class Test6 {
	//휴대폰 번호 가리기
	//프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
	//전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 
	//전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
	class Solution1 {
		public String solution(String phone) {
			String answer = "";
			StringBuilder sb = new StringBuilder(answer);
			for (int i = 0; i < phone.length() - 4; i++) {
				sb.append("*"); //전화번호의 뒷 4자리를 제외한 숫자 갯수만큼 *을 더함
			}
			return answer + phone.substring(phone.length() - 4, phone.length()); //전화번호의 뒷 4자리
		}
	}
	class Solution2 {
		public String solution(String phone) {
			char[] arr = phone.toCharArray();	//char 배열로 바꿈
			for (int i = 0; i < arr.length - 4; i++) {
				arr[i] = '*';	//전화번호의 뒷 4자리를 제외한 나머지 숫자를 *으로 바꿈
			}
			return String.valueOf(arr);	//char 배열을 String으로 바꿈
		}
	}
}
