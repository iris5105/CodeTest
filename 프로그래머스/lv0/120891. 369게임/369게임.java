class Solution {
    public int solution(int order) {
        int answer = 0;
        String [] res = String.valueOf(order).split("");
        for(int i=0; i<res.length; i++){
            if(res[i].equals("3")||res[i].equals("6")||res[i].equals("9")){
                answer++;
            }
        }
        return answer;
    }
}