// 음수로 변경해서 최대값을 구해보자
package morning_exercise;

public class Max03 {
    public int getMat(int[] arr) {
        int maxValue = arr[0]; // arr이 모두 음수인 경우 0으로 하면 0이 max
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {-3, -29, -38, -12, -57, -74, -40, -85, -61};
        Max03 max02 = new Max03();

        int result = max02.getMat(arr);

        if (result == -3) {
            System.out.println("테스트를 통과 했습니다.");
        } else {
            System.out.println("테스트 실패 입니다. result : " + result);
        }
    }
}
