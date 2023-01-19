import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
        int [] check = new int [31];

        for(int i = 1; i <= 30; i++){
            check[i] = 0;
        }

        for(int i = 0; i < 28; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            check[n] = 1;
        }

        for(int i = 1; i <= 30; i++){
            if(check[i] != 1){
                System.out.println(i);
            }
        }
    }
}