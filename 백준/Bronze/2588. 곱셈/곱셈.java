import java.util.*;
public class Main{
public static void main(String[] args){
 Scanner in = new Scanner(System.in);
 int su1 = in.nextInt();
 int su2 = in.nextInt();
 System.out.println(su1*((su2)%10));
 System.out.println(su1*(su2%100/10));
 System.out.println(su1*(su2/100));
 System.out.println(su1*su2);
 }
 }
 