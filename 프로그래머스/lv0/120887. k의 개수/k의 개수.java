class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String t = String.valueOf(k);
        for(int a=i; a<=j; a++){
           String []  str = String.valueOf(a).split("");
            for(int b=0; b<str.length; b++){
                if(Integer.parseInt(str[b])==k){
                    answer++;
                }
            }
        }
        return answer;
    }
}