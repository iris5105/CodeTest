import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int test [] = new int[9];
		int co=0;
		int max=0;
		for (int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine());
			test[i]=Integer.parseInt(st.nextToken());
			if(test[i]>max) {
				max=test[i];
				co=i;		
			}
		}
		System.out.println(max);
		System.out.print(co+1);
	}
}