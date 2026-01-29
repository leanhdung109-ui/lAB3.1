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
    private String id;
    private String name;
    private double salary;

    // Nhập thông tin nhân viên
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: ");
        id = sc.nextLine();
        System.out.print("Nhập tên: ");
        name = sc.nextLine();
        System.out.print("Nhập lương: ");
        salary = sc.nextDouble();
    }

    // Hiển thị thông tin
    public void display() {
        System.out.println("ID: " + id + " - Name: " + name + " - Salary: " + salary);
    }

    // Tính thuế (10% nếu lương > 10 triệu)
    public double calculateTax() {
        if (salary > 10000000) {
            return salary * 0.1;
        }
        return 0;
    }

    // HÀM MAIN - để chạy chương trình
    public static void main(String[] args) {
        cau3 emp = new cau3();

        emp.input();
        emp.display();

        System.out.println("Thuế phải nộp: " + emp.calculateTax());
    }
}
