// 22 10 05
// 랜덤 계산기를 만드시오.
// 각 메소드는 int형 하나만 받습니다.
// ex) A + random숫자
// random숫자는 0~9 정수
// div는 0으로 나눠지면 error가 납니다.
// error처리 : "랜덤하게 생성된 숫자가 0입니다"

class Calculator2 {
    int a = 10;

    public void plus(int b) {
        // +, -에 ()처리를 해주지 않으면 문자로 인식?
        System.out.println(a + " + " + b + " = " + (a+b));
    }
    public void minus(int b) {
        System.out.println(a + " - " + b + " = " + (a-b));
    }
    public void multi(int b) {
        System.out.println(a + " * " + b + " = " + a*b);
    }
    public void div(int b) {
        try {
            System.out.println(a + " / " + b + " = " + a / b);
        } catch(Exception e) {
            System.out.println("랜덤값이 0입니다.");
        }
    }
}

public class RandomCalculator {
    public static void main(String[] args) {
        Calculator2 cal2 = new Calculator2();

        int random = (int)(Math.random()*10);
        cal2.plus(random);
        cal2.minus(random);
        cal2.multi(random);
        cal2.div(random);
    }
}
