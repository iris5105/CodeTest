import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		if(a==b || b==c) {
			if(a==c) {
				System.out.println(10000+(a)*1000);
			}else {
				System.out.println(1000+(b)*100);
			}
		}else if(a==c) {
			System.out.println(1000+(a)*100);
		}else {
			int max= Math.max(a, b);
			max = Math.max(max,c);
			System.out.println(max*100);
		}
	}
}