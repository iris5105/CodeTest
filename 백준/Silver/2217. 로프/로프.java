import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();//줄의 갯수
        Integer k[]= new Integer[N];//각 줄의 중량
        for(int i=0; i<N; i++){
            k[i] = sc.nextInt();
        }
        Arrays.sort(k, Comparator.reverseOrder());
        int result = 0;
        for(int i=0; i<N; i++){
            result = Math.max(k[i]*(i+1), result);
        }
        System.out.print(result);
        sc.close();
    }
}
