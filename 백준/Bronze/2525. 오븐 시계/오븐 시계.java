import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int min= a*60+b+c;
        a=(min/60)%24;
        b=min%60;
        System.out.println(a+" "+b);
       }
    }