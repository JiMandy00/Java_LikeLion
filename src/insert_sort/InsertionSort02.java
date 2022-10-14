package insert_sort;

// 5 8 6 2 4 가 나오도록 정렬을 하시오.

import java.util.Arrays;

public class InsertionSort02 {
    public int[] sort(int[] arr) { // int[]형으로 반환
        int temp;
        int i = 1;

        if (arr[i] < arr[i-1]) {
            temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
         return arr;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};

        InsertionSort02 is = new InsertionSort02(); // 객체(인스턴스) 생성, 선언
        int[] result = is.sort(arr); // result에 arr를 담기

        System.out.println(Arrays.toString(result));

    }
}
