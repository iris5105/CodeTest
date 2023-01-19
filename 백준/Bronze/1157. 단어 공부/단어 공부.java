import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		char chr = ' ';
		int [] res = new int[26];
		String word = br.readLine().toUpperCase();
		for(int i=0; i<word.length(); i++) {
			res[((int)(word.charAt(i)))-65]+=1;
		}
		for(int i=0; i<res.length; i++) {
			if(res[i]>max) {
				max = res[i];
				chr = (char)(i+65);
			}else if(max !=0 && res[i]==max) {
				chr = '?';
			}
		}
		System.out.println(chr);
	}
}