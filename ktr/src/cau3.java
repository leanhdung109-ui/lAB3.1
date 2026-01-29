/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        // Chuẩn hóa chuỗi
        s = s.trim().toLowerCase();
        while (s.contains("  ")) {
            s = s.replace("  ", " ");
        }

        String[] words = s.split(" ");

        // Đếm từ bắt đầu bằng nguyên âm
        int dem = 0;
        for (int i = 0; i < words.length; i++) {
            char c = words[i].charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                dem++;
            }
        }

        // Tìm từ theo thứ tự ABC đầu tiên
        String min = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].compareTo(min) < 0) {
                min = words[i];
            }
        }

        // Đảo ngược thứ tự từ
        String dao = "";
        for (int i = words.length - 1; i >= 0; i--) {
            dao += words[i];
            if (i != 0) dao += " ";
        }

        System.out.println("So tu bat dau bang nguyen am: " + dem);
        System.out.println("Tu xuat hien dau tien theo ABC: " + min);
        System.out.println("Chuoi sau khi dao nguoc: " + dao);
    }
}

