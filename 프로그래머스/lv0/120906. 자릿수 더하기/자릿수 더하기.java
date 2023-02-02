class Solution {
    public int solution(int n) {
        int answer = 0;
		String str = String.valueOf(n);
		int len =str.length();
		for(int i=0; i<len; i++) {
			answer+= Integer.parseInt(str.substring(i, i+1));
		}
        return answer;
    }
}