class Solution {
    public int[] solution(int n, int[] numlist) {
        int num [] = new int[numlist.length];
		int co=0;
		for(int i=0; i<numlist.length; i++) {
			if(numlist[i]%n==0) {
				num[co]=numlist[i];
				co++;
			}
		}
		int [] answer = new int [co];
		for(int i=0; i<co; i++) {
			answer[i]=num[i];
		}
        return answer;
    }
}