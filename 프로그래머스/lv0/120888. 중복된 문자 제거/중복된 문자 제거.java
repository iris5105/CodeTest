class Solution {
    public String solution(String my_string) {
        String answer = "";
        char [] chr = my_string.toCharArray();
        for(int i=0; i<chr.length; i++) {
        	String temp=String.valueOf(chr[i]);
        	for(int j=0; j<chr.length; j++) {
        		if(temp.equals(String.valueOf(chr[j]))&& answer.indexOf(temp)!=-1) {
        			temp="";
        		}
        	}
        	answer+=temp;
        }
        return answer;
    }
}