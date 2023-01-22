class Solution {
    public String solution(String letter) {
        String answer = "";
        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String res[] = letter.split(" ");
        for(int i=0; i<res.length; i++){
            for(int j=0; j<morse.length; j++){
                if(res[i].equals(morse[j])){
                    answer+=(char)(j+97);
                }
            }
        }
        return answer;
    }
}