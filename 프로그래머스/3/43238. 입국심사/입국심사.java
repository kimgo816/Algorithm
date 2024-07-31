import java.util.*;

class Solution {
    
    private static int[] Times;
    private static int N;
    
    public long solution(int n, int[] times) {
        
        N = n;
        Times = times;

        Arrays.sort(Times);

        long left = 0;
        //심사에 걸리는 최대값(모든 사람이 가장 오래 걸리는 심사대에서 심사받을 경우
        long right = (long)Times[Times.length - 1] * n;
        
        return binarySearch(left, right);
    }
    
    //이분탐색 메서드
    public static long binarySearch(long left, long right) {

        //최소 탐색 시작점이 최대 탐색점보다 작을때
        while (left < right) {
            //중앙값부터 시작
            long mid = (left + right) / 2;

            //게임을 더 했는데도 현재 승률보다 높지 않으면
            if (count(mid) < N) {
                //최소 탐색 범위 = mid+1
                left = mid + 1;
            } else { //더 높으면 최대 탐색 범위를 mid로
                right = mid;
            }
        }

        return left;
    }
    
    public static long count(long time) {
        long count = 0;
        for (int i : Times) {
            count += time / i;
        }
        return count;
    }
    
}