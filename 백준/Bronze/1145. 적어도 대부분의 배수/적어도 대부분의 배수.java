import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr= new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 1;

        while(true) {
            int count = 0;
            for (int i = 0 ; i < 5 ; i++) {
                if (answer % arr[i] == 0) {
                    count++;
                }
            }

            if (count >= 3) {
                break;
            } else {
                answer++;
            }
        }

        System.out.println(answer);


    }
}