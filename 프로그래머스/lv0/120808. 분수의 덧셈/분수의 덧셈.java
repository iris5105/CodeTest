class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int max = denom1*denom2;
        //분모 최소공배수 찾기
        if(denom1>denom2){//denom1 이 denom2보다 클 때
            for(int i=max; i>denom1; i--){
                if(i%denom1==0 && i%denom2==0){
                    max=i;
                }
            }
        }else if(denom2>denom1){//denom2가 denom1보다 클 때
            for(int i=max; i>denom2; i--){
                if(i%denom1==0 && i%denom2==0){
                    max=i;
                }
            }
        }else{
            max=denom1;
        }
        //기약분수로 바꾸기 기약분수란 분모와 분자가 1 이외의 약수가 없는 상태;
        answer[0]=(max/denom1)*numer1+(max/denom2)*numer2;
        answer[1]=max;
        int min = Math.min(answer[0],answer[1]);
        for(int i=min; i>=1; i--){
            if(answer[0]%i==0 && answer[1]%i==0){
                answer[0]=answer[0]/i;
                answer[1]=answer[1]/i;
            }
        }
        return answer;
    }
}