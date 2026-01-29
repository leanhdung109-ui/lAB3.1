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
    String id;
    String name;
    double score;

    // Nhap thong tin
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        id = sc.nextLine();
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap diem: ");
        score = sc.nextDouble();
    }

    // Hien thi thong tin
    public void display() {
        System.out.println("ID: " + id + " - Name: " + name + " - Score: " + score);
    }

    // Kiem tra dat
    public boolean isPass() {
        return score >= 5;
    }

    // HAM MAIN (de chay)
    public static void main(String[] args) {
        cau1 sv = new cau1();

        sv.input();
        sv.display();

        if (sv.isPass()) {
            System.out.println("Ket qua: Dat");
        } else {
            System.out.println("Ket qua: Khong dat");
        }
    }
}
