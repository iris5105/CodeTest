import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> check = new ArrayList<>();
        for(int i=2; i<=n;i++){
            if(n%i==0){
                int co=0;
                for(int j=2; j<i; j++){
                    if(i%j==0){
                        co++;
                    }
                }
                if(co==0){
                    check.add(i);
                }
            }

        }
        int [] answer =check.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}