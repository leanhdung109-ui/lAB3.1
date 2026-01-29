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

public class cau5 {
    static Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void nhapMang(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Điểm[" + i + "] = ");
            arr[i] = sc.nextDouble();
        }
    }

    public static void xuatMang(double[] arr) {
        System.out.print("Danh sách điểm: ");
        for (double x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static double tinhDiemTrungBinh(double[] arr) {
        double tong = 0;
        for (double x : arr) {
            tong += x;
        }
        return tong / arr.length;
    }

    public static String xepLoai(double dtb) {
        if (dtb >= 8.0) return "Giỏi";
        else if (dtb >= 6.5) return "Khá";
        else if (dtb >= 5.0) return "Trung bình";
        else return "Yếu";
    }

    public static void main(String[] args) {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();

        double[] diem = new double[n];

        nhapMang(diem);
        xuatMang(diem);

        double dtb = tinhDiemTrungBinh(diem);
        System.out.println("Điểm trung bình = " + dtb);
        System.out.println("Xếp loại = " + xepLoai(dtb));
    }
}

    

