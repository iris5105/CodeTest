class Solution {
    public String solution(String polynomial) {
        String answer ="";
        int xnum=0;
		int num=0;
		String res[] = polynomial.split(" ");
		for(int i=0; i<res.length; i++) {
			if(res[i].contains("x")) {
				String st = res[i].replace("x", "");
				if(st.equals("")) {
					xnum+=1;
				}else {
				    xnum+=Integer.parseInt(st);
				}
			}else if(!res[i].equals("+"))
				num+=Integer.parseInt(res[i]);
		}
        
       if(num==0){
            if(xnum==1){
                answer="x";
            }else{
                answer=String.valueOf(xnum)+"x";
            }
        }else if(xnum==1 || xnum==0){
           if(xnum==1){
               answer="x + "+String.valueOf(num);
           }else if(xnum==0){
               answer=String.valueOf(num);
           }
        }else{
            answer=String.valueOf(xnum)+"x + "+String.valueOf(num);
        }
        return answer;
    }
}