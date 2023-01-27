class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int num1=0;
        int num2=0;
        for(int i=0; i<score.length; i++){
            num1=score[i][0]+score[i][1];
            answer[i]=1;
            for(int j=0; j<score.length; j++){
                num2=score[j][0]+score[j][1];
                if(num1<num2 && i!=j){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}