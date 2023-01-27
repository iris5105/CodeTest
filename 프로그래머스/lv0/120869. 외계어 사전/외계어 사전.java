class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(int i=0; i<dic.length; i++){
            String str = dic[i];
            int co=0;
            for(int j=0; j<spell.length; j++){
                if(str.contains(spell[j])){
                    co++;
                }

            }
            if(co==spell.length){
            answer=1;
            }
        }
        return answer;
    }
}