class Solution {
    public int[] solution(int n) {
        int num=0;
        if(n%2==0){
            num=n/2;   
        }else{
            num=(n+1)/2;
        }
        int index=0;
        int[] answer = new int[num];
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                answer[index]=i;
                index++;
            }
        }
        return answer;
    }
}