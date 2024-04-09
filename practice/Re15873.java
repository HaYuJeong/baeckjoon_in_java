package RePractice;

import java.util.Scanner;

/**
 * packageName : RePractice
 * fileName : Re15873
 * author : hayj6
 * date : 2024-04-09(009)
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-04-09(009)         hayj6          최초 생성
 */
public class Re15873 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();  // 입력되는 숫자

        if(a == 1010) {
            System.out.println(20);
        } else if (a % 10 == 0) {
            System.out.println(a / 100 + 10);
        } else {        // 104, 38
           if(a / 10 == 10){
               System.out.println(a % 10 + 10);
        } else{
               System.out.println(a / 10 + a % 10);}
        }


    }
}
