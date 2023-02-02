import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] chr1= before.toCharArray();
		char[] chr2= after.toCharArray();
		Arrays.sort(chr1);
		Arrays.sort(chr2);
		if(String.valueOf(chr1).equals(String.valueOf(chr2))) {
			answer =1;
		}
        return answer;
    }
}