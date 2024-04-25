package level1;

public class Test1 {
	// 문자열 내 p와 y의 개수 비교하는 함수
	boolean solution1(String s) {
		s = s.toUpperCase();
		return s.chars().filter(e -> e == 'P').count() == s.chars().filter(e -> e == 'Y').count() ? (true) : (false);
	}

	boolean solution2(String s) {
		s = s.toUpperCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'P') {
				count++;
			} else if (s.charAt(i) == 'Y') {
				count--;
			}
		}
		return count == 0;
	}

}
