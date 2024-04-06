package RePractice;

import java.util.Scanner;

/**
 * packageName : RePractice
 * fileName : Re11720
 * author : hayj6
 * date : 2024-04-06(006)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-06(006)         hayj6          최초 생성
 */
public class Re11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  // 5
        String a = scanner.next();  // 54321
        int sum = 0;

        for (int i = 0; i < N; i++) {
            char temp = a.charAt(i);    // i=0이면 '5', i=1이면 '4', '3', '2', '1'
            String str = String.valueOf(temp);  // "5", "4", "3", "2", "1"
            int num = Integer.parseInt(str);    // 5, 4, 3, 2, 1
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
