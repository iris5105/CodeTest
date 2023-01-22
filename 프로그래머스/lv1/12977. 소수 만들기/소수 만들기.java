class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int su=0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int co=0;
                   su = nums[i]+nums[j]+nums[k];
                    for(int a=1; a<=su; a++){
                        if(su%a==0){
                            co++;
                        }
                    }
                   if(co==2){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}