/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        boolean laChinhPhuong = false;
        if (n >= 0) {
            int can = (int) Math.sqrt(n);
            if (can * can == n) {
                laChinhPhuong = true;
            }
        }

        boolean laBoi4 = (n % 4 == 0);

        if (laChinhPhuong && laBoi4) {
            System.out.println("Thoa man ca hai");
        } else {
            System.out.println("Khong thoa man");
        }
    }
}

