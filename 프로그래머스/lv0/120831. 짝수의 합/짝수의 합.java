class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=0; i<=n; i++){
            if(i%2!=1){
                answer+=i;
            }
        }
        return answer;
    }
}