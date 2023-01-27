class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(int i=0; i<2; i++){
            for(int j=0; j<db.length; j++){
                if(id_pw[0].equals(db[j][0])){
                    if(id_pw[1].equals(db[j][1])){
                        answer="login";
                    }else{
                        answer="wrong pw";
                    }
                    break;
                }else{
                    answer="fail";
                }
            }
        }
        return answer;
    }
}