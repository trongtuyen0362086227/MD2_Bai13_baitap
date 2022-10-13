package baitap2;

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai mang");
        int arrInt_size = Integer.parseInt(sc.nextLine());
        int[] arrInt = new int[arrInt_size];
        System.out.println("nhap cac phan tu cho mang");
        for (int i = 0; i < arrInt_size; i++) {
            System.out.printf("Nhap phan tu thu: %d ", (i + 1));
            arrInt[i] = Integer.parseInt(sc.nextLine());
        }
        //Sap xep mang tang dan
        for (int i = 0; i < arrInt_size - 1; i++) {
            for (int j = i + 1; j < arrInt_size; j++) {
                if (arrInt[i] >= arrInt[j]) {
                    int temp = arrInt[i];
                    arrInt[i] = arrInt[j];
                    arrInt[j] = temp;
                }
            }
        }
        System.out.println("Nhap phan tu can tim kiem vao");
        int number = Integer.parseInt(sc.nextLine());
        if(binarySearch(arrInt, number)!=-1){
            System.out.printf("%d nam o vi tri index %d\n",number,binarySearch(arrInt, number));
        } else {
            System.out.printf("khong tim thay %d trong mang",number);
        }
    }

    //viet ham tim kiem phan tu de quy
    public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        while (right >= left) {
            int mid = (left + right) / 2;
            if (value < arr[mid]) {
                right = mid - 1;
            } else if (value == arr[mid]) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}