package star;

// 직사각형 만들기

public class star_5 {
    void printRectangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        star_5 rec = new star_5();
        rec.printRectangle(3);
    }

}
