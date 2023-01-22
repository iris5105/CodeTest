class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String a = String.valueOf(num);
        String b = String.valueOf(k);
        int c = a.indexOf(b);
        if(c!=-1){
            c++;
        }
        return c;
    }
}