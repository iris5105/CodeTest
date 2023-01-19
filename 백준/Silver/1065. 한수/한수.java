import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int co=0;
		for(int i=1; i<=n; i++) {
			boolean Chk = ChckNum(i);
			if (Chk==true) {
				co++;
			}
		}
		System.out.println(co);

	}
	private static boolean ChckNum(int num) {
		if(num<100) {
			return true;
		}else if(num>99 & num<1000) {
			int su1=num/100;
			int su2=(num%100)/10;
			int su3 =(num%10);
			if((su1-su2)==(su2-su3)){
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}

}