import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		String st2 = sc.next();
		
		StringBuilder sb = new StringBuilder(st);
		StringBuilder sb2 = new StringBuilder(st2);
		st = sb.reverse().toString();
		st2 = sb2.reverse().toString();
		
		int num = Integer.parseInt(st);
		int num2 = Integer.parseInt(st2);
		
		
		if(num>num2)
			System.out.println(num);
		else
			System.out.println(num2);
	}
}