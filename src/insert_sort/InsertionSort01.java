package insert_sort;

import java.util.Arrays;

public class InsertionSort01 {
    public int[] sort(int[] arr) { // int[]형으로 반환
        int i = 1; // 왜 한거지? 없어도 작동 됨
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort01 is = new InsertionSort01(); // 객체(인스턴스) 생성, 선언
        int[] result = is.sort(arr); // result에 arr를 담기

        System.out.println(Arrays.toString(arr));

    }
}
