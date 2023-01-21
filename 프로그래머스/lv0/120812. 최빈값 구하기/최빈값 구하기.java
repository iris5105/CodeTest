import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int len = array.length;
        int res [] = new int [1001];
        for(int i=0; i<len; i++){
            res[array[i]]++;
        }
        int max=0;
        int max_num=0;
        for(int i=0; i<res.length; i++){
            if(res[i]>max){
                max=res[i];
                max_num=i;
            }
        }
        int co=0;
        for(int i=0; i<res.length; i++){
            if(res[i]==max){
                co++;
            }
        }
        if(co>1){
            answer=-1;
        }else{
            answer=max_num;
        }
        return answer;
    }
}