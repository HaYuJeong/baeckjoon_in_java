package RePractice;

import java.util.Scanner;

/**
 * packageName : RePractice
 * fileName : Re5086
 * author : hayj6
 * date : 2024-04-04(004)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-04(004)         hayj6          최초 생성
 */
public class Re5086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if(a == 0 && b == 0) break;
//

            if (a >= b) {
                if (a % b == 0) {
                    System.out.println("multiple");
                } else {
                    System.out.println("neither");
                }
            } else if (a < b) {
                if (b % a == 0) {
                    System.out.println("factor");
                } else {
                    System.out.println("neither");
                }
            } else {
                System.out.println("neither");
            }
//            if (a >= b && a % b == 0) {
//                System.out.println("multiple");
//            } else if ( a < b && a % b == 0) {
//                System.out.println("factor");
//            } else {
//                System.out.println("neither");
//            }
        }
    }
}
