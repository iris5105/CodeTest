import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0;
		while(true) {
			if(i>=n) {
				break;
			}
			int co=0;
			int tot=0;
			String str = sc.next();
			char[] myChr = str.toCharArray();
			for(int j=0; j<myChr.length; j++) {
				if(myChr[j]=='O') {
					co++;
					tot+=co;
				}
				else {
					co=0;
				}
			}
		i++;
		System.out.println(tot);
		}
	}
}
