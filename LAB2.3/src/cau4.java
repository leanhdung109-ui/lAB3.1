/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
    
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.print("Nhập số phần tử n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử [" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        int tong = 0;
        int max = arr[0];
        int demAm = 0;

        System.out.print("Mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            tong += arr[i];
            if (arr[i] > max) max = arr[i];
            if (arr[i] < 0) demAm++;
        }

        System.out.println();
        System.out.println("Tổng các phần tử = " + tong);
        System.out.println("Số lớn nhất = " + max);
        System.out.println("Số lượng số âm = " + demAm);
    }
}

