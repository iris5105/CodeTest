class Solution {
    public String solution(String my_string, int num1, int num2) {
        char [] chr = my_string.toCharArray();
        char temp= chr[num2];
		chr[num2]=chr[num1];
		chr[num1]=temp;
        return String.valueOf(chr);
    }
}