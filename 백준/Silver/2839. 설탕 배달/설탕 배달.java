import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a=0;  //5로 나눈 횟수
        int b=0;  //3으로 나눈 횟수
        int d=0; //총 횟수
        while(true){
            if(n%5==0){
                d+=n/5;
                
                break;
            }else{
                n-=3;
                d++;
            }
            if(n<0){
                d=-1;
                
                break;
            }
        }
        System.out.print(d);
     }
}