class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char [] chr = cipher.toCharArray();
        for(int i=0; i<chr.length; i++){
            if((i+1)%code==0){
                answer+=chr[i];
            }
        }
        return answer;
    }
}