import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int bil = sc.nextInt();
		int num = sc.nextInt();
		int i=0;
		while(i<num) {
			int pr = sc.nextInt();
			int qty = sc.nextInt();
			bil-=(pr*qty);
			i++;
		}
		if(bil==0) {
		System.out.println("Yes");
		}else {
		System.out.println("No");
	}
	}
}