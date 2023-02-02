class Solution {
    public String solution(String my_string) {
        String answer = "";
        char [] chr = my_string.toCharArray();
        int num=0;
        for(int i=0; i<chr.length; i++){
            if((int)chr[i]>=97){
                answer+=(char)((int)(chr[i])-32);
            }else{
                answer+=(char)((int)(chr[i])+32);
            }
        }
        return answer;
    }
}