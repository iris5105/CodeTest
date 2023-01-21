class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        while(answer++<n){
            if(answer*slice>=n){
                break;
            }
        }
        return answer;
    }
}