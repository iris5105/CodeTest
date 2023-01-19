import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //inout 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//output 선언
		StringTokenizer st;
		int t= Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a+b+"\n");
		}
		bw.close();
	}
}