class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer =my_string;
        while(true){
            answer= answer.replace("a","");
            answer= answer.replace("e","");
            answer= answer.replace("i","");
            answer= answer.replace("o","");
            answer= answer.replace("u","");
            break;
        }
        return answer;
    }
}