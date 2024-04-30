package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test4 {
	//나누어 떨어지는 숫자 배열 반환하기
	class Solution1 {
	    public int[] solution(int[] arr, int divisor) {
	    	ArrayList<Integer> list = new ArrayList<>();
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]%divisor == 0){
	                list.add(arr[i]);
	            }
	        }
	        if(list.isEmpty()){
	            list.add(-1);
	        }
	        Collections.sort(list);
	        Integer[] integerArr = list.toArray(new Integer[list.size()]);
	        return Arrays.stream(integerArr).mapToInt(Integer::intValue).toArray();
	    }
	}
	class Solution2 {
		public int[] solution(int[] arr, int divisor) {
			int[] answerArr = Arrays.stream(arr).filter(e->e%divisor==0).sorted().toArray();
			if(answerArr.length == 0) {
				answerArr[0] = -1;
			}
			return answerArr;
		}
	}
}
