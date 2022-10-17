package star;

public class Star_2 {


    void Print(int n) {
        for (int i = 1; i <= n; i++) {
            // 공백 출력
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");

            }
            for (int ii = 1; ii <= i; ii++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Star_2 printStar = new Star_2();
        printStar.Print(5);
    }
}
