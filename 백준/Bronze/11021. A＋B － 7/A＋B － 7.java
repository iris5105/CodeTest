import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		for(int b=0; b<t; b++) {
			st = new StringTokenizer(br.readLine());
			int res = (Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			bw.write("Case #"+(b+1)+": "+res+"\n");
		}
		bw.close();
	}
}
