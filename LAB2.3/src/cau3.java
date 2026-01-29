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

public class cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);
        int n;

        do {
            System.out.print("Nhập số nguyên dương n: ");
            n = sc.nextInt();
        } while (n <= 0);

        int tong = 0;
        long giaiThua = 1;
        int demChan = 0;

        for (int i = 1; i <= n; i++) {
            tong += i;
            giaiThua *= i;
            if (i % 2 == 0) {
                demChan++;
            }
        }

        System.out.println("Tổng từ 1 đến n = " + tong);
        System.out.println("Giai thừa của n = " + giaiThua);
        System.out.println("Số lượng số chẵn từ 1 đến n = " + demChan);
    }
}

