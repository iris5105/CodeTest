import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        int max = -1000001;
		int min = 1000001;
		
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			if (num > max) {
				max = num;
			} 
            if (num < min) {
				min = num;
			}
		}
		bw.write(min+" "+max);
		bw.flush();
	}
}