package bublle_sort;

import java.util.Arrays;

class Sort {
    int[] arr;
    int temp;

    Sort(int[] arr) {
        this.arr = arr;
    }

    int[] Buble() {
        for (int i=0; i<arr.length-1; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        Sort sort = new Sort(arr);

        System.out.println(Arrays.toString(sort.Buble()));
    }

}
