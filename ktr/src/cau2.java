/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class cau2 {

    // Kiểm tra số hoàn hảo
    public static boolean laSoHoanHao(int x) {
        if (x <= 0) return false;

        int tong = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0) {
                tong += i;
            }
        }
        return tong == x;
    }

    // Đếm số hoàn hảo trong mảng
    public static int demSoHoanHao(int[] a, int n) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (laSoHoanHao(a[i])) {
                dem++;
            }
        }
        return dem;
    }

    // Tính tổng phần tử > trung bình
    public static int tongLonHonTrungBinh(int[] a, int n) {
        int tong = 0;
        for (int i = 0; i < n; i++) {
            tong += a[i];
        }
        double tb = (double) tong / n;

        int ketQua = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > tb) {
                ketQua += a[i];
            }
        }
        return ketQua;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap n > 0: ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        System.out.println("So luong so hoan hao: " + demSoHoanHao(a, n));
        System.out.println("Tong phan tu lon hon trung binh: " + tongLonHonTrungBinh(a, n));
    }
}


