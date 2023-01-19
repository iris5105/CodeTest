import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		for(int i=0; i<C; i++) {
			int tot =0;
			int N =sc.nextInt();
			int score[] = new int[N];
			for(int j=0; j<N; j++) {
				int co=0;
				score[j] = sc.nextInt();
				tot+=score[j];
				if(j==N-1) {
					double avg = tot/N;
					for(int k=0; k<N; k++) {
						if(score[k]>avg) {
							co++;
						}
					}
					System.out.printf("%.3f",((float)co/N)*100);
					System.out.println("%");
				}
			}
		}
	}
}
