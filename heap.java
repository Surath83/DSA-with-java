import java.util.*;
import java.util.Objects;

public class heap {
    public static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdu = i;
        if (left < size && arr[left] > arr[maxIdu]) {
            maxIdu = left;
        }
        if (right < size && arr[right] > arr[maxIdu]) {
            maxIdu = right;
        }
        if (maxIdu != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdu];
            arr[maxIdu] = temp;
        }
    }

    public static void HeapSort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2; i >= 0; i--) {
            heapify(arr, i, n);
        }
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 3 };
        HeapSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}