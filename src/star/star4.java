package star;

// 정사각형

public class star4 {
    void printSquareMatrix(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        star4 square = new star4();
        square.printSquareMatrix(3);
    }
}
