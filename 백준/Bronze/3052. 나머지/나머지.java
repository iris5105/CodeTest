import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		HashSet<Integer>res = new HashSet<Integer>();
		int su=0;
		for(int i=0; i<10; i++) {
			st = new StringTokenizer(br.readLine());
			su = Integer.parseInt(st.nextToken());
			res.add(su%42);
		}
		System.out.println(res.size());		
	}
}
