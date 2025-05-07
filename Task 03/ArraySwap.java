package DSA;

import java.util.Scanner;

public class ArraySwap {
    static void swap(int l, int r, int[] arr) {
        if (l >= r)
            return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        swap(l + 1, r - 1, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        swap(0, n - 1, arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
