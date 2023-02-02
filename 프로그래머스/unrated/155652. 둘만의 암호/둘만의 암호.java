class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
		int num=0;
		char [] text = s.toCharArray();
		char [] test = skip.toCharArray();
		for (int i = 0; i < text.length; i++) {
			int co = 0;
			num = (int) text[i];
			while (co++ <index) {
				num++;
                if (num > 122) {
					num = 97;
				}
				for (int j = 0; j < test.length; j++) {
					if (num == (int)test[j]) {
						co--;
					}
				}
			}
			answer+=String.valueOf((char)num);
		}
        return answer;
    }
}