import java.util.*;
public class Main{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int A,B;
			A = sc.nextInt();
			B = sc.nextInt();
			String C;
			if(A>B) C = ">";
			else if(A<B) C = "<";
			else  C = "==";
			System.out.println(C);
		}
}

