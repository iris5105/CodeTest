import java.util.Scanner;

public class Main {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String n[] = sc.nextLine().split(" ");
	int a = Integer.parseInt(n[0]);
	int b = Integer.parseInt(n[1]);
	System.out.println(a*b-1);
}
}