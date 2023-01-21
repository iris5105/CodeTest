class Solution {
    public int solution(int n) {
        int answer = 0;
        while(answer++<n){
            if((answer*6)%n==0){
                break;
            }
        }
        return answer;
    }
}
