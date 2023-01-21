class Solution {
    public int solution(int price) {
        int answer = 0;
        int test=price/100000;
        if(test>=5){
            answer=(int)(price-(price*0.2));
        }else if(test>=3){
            answer=(int)(price-(price*0.1));
        }else if(test>=1){
            answer=(int)(price-(price*0.05));
        }else{
            answer=(int)price;
        }
        return answer;
    }
}