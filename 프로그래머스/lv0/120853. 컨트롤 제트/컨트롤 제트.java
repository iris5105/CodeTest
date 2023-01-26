class Solution {
    public int solution(String s) {
        int answer = 0;
        String str[] = s.split(" ");
        int on = 0;
        int num=0;
        for(int i=0; i<str.length; i++){
            if(!str[i].equals("Z")){
                on=answer;
                answer+=Integer.parseInt(str[i]);
            }else{
                answer=on;
            }
        }
        return answer;
    }
}