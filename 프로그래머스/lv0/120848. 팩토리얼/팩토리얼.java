class Solution {
    public int solution(int n) {
        int answer = 0;
        int pac = 1;
        for(int i=1; i<=11; i++){
            pac*=i;
            if(pac>n){
                answer=i-1;
                break;
            }
        }
        return answer;
    }
}