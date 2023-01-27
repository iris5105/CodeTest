import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer>list = new ArrayList<>();
        String str="";
        String [] con = my_string.split("");
        for(int i=0; i<con.length; i++){
            if((int)con[i].charAt(0)<65){
                list.add(Integer.parseInt(con[i]));
            }
        }
        int[]answer = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        return answer;
    }
}