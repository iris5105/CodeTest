import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num=0;
		float tot=0;
		for(int i=0; i<n;i++) {
			int su = sc.nextInt();
			if(su>num) {
				num=su;
			}
			tot+=su;
		}
		System.out.printf("%f",(tot/num/n)*100);
	}
}