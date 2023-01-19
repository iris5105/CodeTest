import java.util.*;
public class Main{
public static void main(String[] args){
    Scanner in= new Scanner(System.in);
    int H=in.nextInt();
    int M=in.nextInt();
    if(M<45){
      if(H==0) {
          H = 23;
          System.out.println(H+" "+((60+M)-45));
    }else{
          System.out.println((H-1)+" "+((60+M)-45));
          }
        }else System.out.println(H+" "+(M-45));
}
}