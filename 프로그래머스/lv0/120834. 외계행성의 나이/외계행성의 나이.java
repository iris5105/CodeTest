class Solution {
    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);
        for(int i=0; i<str.length(); i++) {
        	answer+=(char)(97+Integer.parseInt(str.substring(i, i+1)));
        }
        return answer;
    }
}