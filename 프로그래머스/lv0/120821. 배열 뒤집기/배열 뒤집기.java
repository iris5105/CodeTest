class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length-1;
        int[] answer = new int[num_list.length];
        int co=0;
        for(int i=len; i>=0; i--){
            answer[co]= num_list[i];
            co++;
        }
        return answer;
    }
}