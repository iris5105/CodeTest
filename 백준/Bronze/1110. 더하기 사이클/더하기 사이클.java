import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int su = sc.nextInt();
		int su1 = su;
		int co=0;
		while (true) {
			while(true) {
				int a=su1/10;
				int b = su1%10;
				int c= (a+b)%10;
				su1 = b*10+c;
				co++;
				break;
			}
			if(su1==su) {
				break;
			}
		}
		System.out.println((co));
	}
}
