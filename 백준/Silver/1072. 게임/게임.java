import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static long x;
    private static long y;
    private static int target;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        target = (int) ((y * 100) / x);

        System.out.println(binarySearch(0, 1000000000));

    }

    public static int binarySearch(int left, int right) {
        
        if (target >=99) {
            return -1;
        }
        
        while (left < right) {
            //중앙값부터 시작
            int mid = (left + right) / 2;
            int newTarget = (int) (((y + mid) * 100) / (x + mid));

            if (newTarget <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        //블루레이 크기 중 최소값 리턴
        return left;
    }
}