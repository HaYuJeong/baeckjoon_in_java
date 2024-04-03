package RePractice;


import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName : RePractice
 * fileName : Re2738
 * author : hayj6
 * date : 2024-04-03(003)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-03(003)         hayj6          최초 생성
 */
public class Re2738 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // 3
        int M = scanner.nextInt();  // 3

        int[][] arr1 = new int[N][M];   //3 * 3 [1 1 1] [2 2 2] [0 1 0]
        int[][] arr2 = new int[N][M];   //3 * 3 [3 3 3] [4 4 4] [5 5 100]
        int[][] plusArr = new int[N][M];    // 배열을 더한것

        for (int i = 0; i < N; i++) {           // 0 1 2 3
            for (int j = 0; j < M; j++) {       // 0 1 2 3
                arr1[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {           // 0 1 2 3
            for (int j = 0; j < M; j++) {       // 0 1 2 3
                arr2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                plusArr[i][j] = arr1[i][j] + arr2[i][j];
//               plusArr[0][0] = arr1[0][0] + arr2[0][0] : 4
//               plusArr[0][1] = arr1[0][1] + arr2[0][1] : 4
//               plusArr[0][2] = arr1[0][2] + arr2[0][2] : 4
//               plusArr[1][0] = arr1[1][0] + arr2[1][0] : 5
//               plusArr[1][1] = arr1[1][1] + arr2[1][1] : 5
//               plusArr[1][2] = arr1[1][2] + arr2[1][2] : 5 ...

//                if (j == 0) {
                    System.out.print(plusArr[i][j] + " ");
//                }
            }
            System.out.println();
        }
//        System.out.print(Arrays.deepToString(plusArr) + " ");
    }
}