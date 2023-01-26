class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int co=0;
        int res=0;
        int max=Math.max(a,b);
        for(int i=max; i>=2; i--){
            if(a%i==0 && b%i==0){
                a=a/i;
                b=b/i;
                break;
            }
        }
       if(a%b==0){
           return answer=1;
       }
        for(int i=2; i<=b; i++){
            if(b%i==0){
                co=0;
                for(int j=2; j<=i; j++){
                    if(i%j==0){
                        co++;
                    }
                }
                if(co==1&&i!=2&&i!=5){
                    res++;
                }
            }
        }
        if(res==0){
            answer=1;
        }else{
            answer=2;
        }
        return answer;
    }
}