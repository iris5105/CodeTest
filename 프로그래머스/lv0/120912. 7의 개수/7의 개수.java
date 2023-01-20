class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String str ="";
        for(int i=0; i<array.length; i++){
            str+=array[i];
        }
        char []res=str.toCharArray();
        for(int i=0; i<res.length; i++){
            if(res[i]=='7'){
                answer++;
            }
        }
        return answer;
    }
}