import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for(int i=0; i<num; i++){
      String str = sc.next();
      int size = str.length();

      System.out.print(str.substring(0,1));
      System.out.println(str.substring(size-1,size));
    }
  }

}