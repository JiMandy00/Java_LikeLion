package star;

public class Star_1 {


    public static void main(String[] args) {
//        1단계
//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");

        for(int i=1; i<=4; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
