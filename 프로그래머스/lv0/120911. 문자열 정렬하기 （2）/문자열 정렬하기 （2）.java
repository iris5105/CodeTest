import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char str[] = my_string.toLowerCase().toCharArray();
		Arrays.sort(str);
        for(int i=0; i<str.length; i++){
            answer+=str[i];
        }
        return answer;
    }
}