import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int rep = sc.nextInt();
		int i=0;
		while(i<rep) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
			i+=1;
		}
	}
}