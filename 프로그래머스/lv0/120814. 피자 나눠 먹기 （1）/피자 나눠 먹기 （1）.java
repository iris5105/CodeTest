class Solution {
    public int solution(int n) {
        int answer = 0;
        int res=0;
        if(n%7>0){
            res=1;
        }
        return answer=(n/7)+res;
    }
}