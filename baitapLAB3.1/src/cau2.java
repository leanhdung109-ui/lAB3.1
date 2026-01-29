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
    double length;
    double width;

    // Nhap thong tin
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        length = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        width = sc.nextDouble();
    }

    // Tinh dien tich
    public double getArea() {
        return length * width;
    }

    // Tinh chu vi
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Hien thi thong tin
    public void display() {
        System.out.println("Length: " + length + " - Width: " + width);
    }

    // HAM MAIN
    public static void main(String[] args) {
        cau2 hcn = new cau2();

        hcn.input();
        hcn.display();

        System.out.println("Dien tich: " + hcn.getArea());
        System.out.println("Chu vi: " + hcn.getPerimeter());
    }
}

    

