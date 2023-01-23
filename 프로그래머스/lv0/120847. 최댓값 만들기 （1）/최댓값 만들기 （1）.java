import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Integer [] num = new Integer [numbers.length];
        Arrays.setAll(num, i -> numbers[i]);
        Arrays.sort(num,Collections.reverseOrder());
        answer = num[0]*num[1];
        return answer;
    }
}