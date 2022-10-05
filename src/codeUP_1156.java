import java.util.Scanner;

public class codeUP_1156 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        // System.out.print(">>"); // 이걸 없애야 성공!
        int num = scr.nextInt();

        if (num % 2 == 0) { // 짝수
            System.out.println("even");
        } else { // 짝수가 아니라면. 즉 홀수라면
            System.out.println("odd");
        }
    }
}
