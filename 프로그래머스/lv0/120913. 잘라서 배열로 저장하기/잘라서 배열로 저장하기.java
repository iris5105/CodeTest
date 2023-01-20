class Solution {
    public String[] solution(String my_str, int n) {
        int len=0;
        if(my_str.length()%n==0){
            len=my_str.length()/n;
        }else{
            len=my_str.length()/n+1;
        }
        String[] answer = new String[len];
        for(int i=0; i<len;i++){
            if((i*n)>my_str.length()-n){
                answer[i]=my_str.substring(n*i,my_str.length());
            }else{
                answer[i]=my_str.substring(n*i,n*i+n);
            }
        }
        return answer;
    }
}