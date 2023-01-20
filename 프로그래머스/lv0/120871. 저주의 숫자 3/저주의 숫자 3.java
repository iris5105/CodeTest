class Solution {
    public int solution(int n) {
        int answer = 1;
        int i=0;
       while(i<n){
           
           String str = String.valueOf(answer);
           if(answer%3==0 || str.indexOf("3")!=-1){
               i--;
           }
           i++;
           answer++;
       }
        return answer-1;
    }
}