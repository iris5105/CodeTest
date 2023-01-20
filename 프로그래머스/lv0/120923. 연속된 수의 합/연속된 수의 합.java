class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid=total/num;//기준 값
        if(num%2==1){ //배열의 수가 홀수
            for(int i=0; i<num; i++){
                if(i<num/2){
                    answer[i]=mid-(num/2-i);
                }else if(i>num/2){
                    answer[i]=mid+(i-num/2);
                }else
                    answer[i]=mid;
            }
        }else{//배열의 수가 짝수
            for(int i=0; i<num; i++){
                if(i<=num/2-1){                 
                    answer[i]=mid-((num/2-1)-i);
                }else if(i>=num/2){
                    answer[i]=mid+(i-num/2+1);
                }
            }
        }
        return answer;
    }
}