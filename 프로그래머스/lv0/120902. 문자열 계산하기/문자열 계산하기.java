class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String [] str = my_string.split(" ");
        int num=Integer.parseInt(str[0]);
        for(int i=1; i<str.length; i++){
            if(str[i].equals("+")){
                num+=Integer.parseInt(str[i+1]);
            }else if(str[i].equals("-")){
                num-=Integer.parseInt(str[i+1]);
            }
        }
        return num;
    }
}