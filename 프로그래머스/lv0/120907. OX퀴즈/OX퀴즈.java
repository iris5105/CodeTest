class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            int res=0;
            String str[] = quiz[i].split(" ");
            switch(str[1]){
                case "+" : res = Integer.parseInt(str[0])+Integer.parseInt(str[2]);
                    break;
                case "-" : res = Integer.parseInt(str[0])-Integer.parseInt(str[2]);
                    break;
            }
            if(Integer.parseInt(str[4])==res){
                answer[i]="O";
            }else{
                answer[i]="X";
            }
        }
        return answer;
    }
}