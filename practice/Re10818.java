package Practice0;

import java.util.Scanner;

/**
 * packageName : Practice0
 * fileName : Re10818
 * author : hayj6
 * date : 2024-04-01(001)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-01(001)         hayj6          최초 생성
 */
public class Re10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // 5
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        int max = -1000001;
        int min = 1000001;

        for (int i = 0; i < N; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(min + " "  + max);

    }
}