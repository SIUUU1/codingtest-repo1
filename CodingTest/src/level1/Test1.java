package level1;

public class Test1 {
	// 문자열 내 p와 y의 개수 비교하는 함수
	boolean solution1(String s) {
		s = s.toUpperCase(); //대소문자 상관없이
		return s.chars().filter(e -> e == 'P').count() 
				== s.chars().filter(e -> e == 'Y').count() 
				? (true) : (false);  //스트림을 삼항연산자에 넣어 각각의 갯수비교
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
