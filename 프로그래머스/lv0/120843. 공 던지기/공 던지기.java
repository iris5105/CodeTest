class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int len=numbers.length;
        int co=1;
        while(true){
            if(answer>len){
                answer-=len;
            }
            if(co==k){
                break;
            }
            co++;
            answer+=2;
        }
        return numbers[answer];
    }
}