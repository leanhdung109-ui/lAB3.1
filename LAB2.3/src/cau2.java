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

public class cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.println("===== MENU =====");
        System.out.println("1. Tinh tổng 2 số");
        System.out.println("2. Tinh hiệu 2 số");
        System.out.println("3. Tinh tich 2 số");
        System.out.println("4. Tinh thuong  2 số");
        System.out.print("Chọn chức năng: ");
        int chon = sc.nextInt();

        System.out.print("Nhập số a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập số b: ");
        double b = sc.nextDouble();

        switch (chon) {
            case 1:
                System.out.println("Tổng = " + (a + b));
                break;
            case 2:
                System.out.println("Hiệu = " + (a - b));
                break;
            case 3:
                System.out.println("Tích = " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Lỗi: Không thể chia cho 0");
                } else {
                    System.out.println("Thương = " + (a / b));
                }
                break;
            default:
                System.out.println("Chọn sai chức năng!");
        }
    }
}

