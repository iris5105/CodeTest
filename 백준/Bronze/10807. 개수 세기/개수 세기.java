import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int v[] = new int[n];
		int co=0;
		for(int i =0; i<n; i++) {
			v[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		for(int i=0; i<n; i++) {
			if (v[i]==x){
				co++;
			}
		}
		System.out.println(co);
	}
}