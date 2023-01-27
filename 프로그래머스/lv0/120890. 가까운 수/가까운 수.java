import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min=1000;
        Arrays.sort(array);
        for(int i=0; i<array.length; i++){
            if(Math.abs(n-array[i])<min){
                min=Math.abs(n-array[i]);
                answer=array[i];
            }else if(Math.abs(n-array[i])==min){
                 answer = array[i-1];
            }
        }
        return answer;
    }
}