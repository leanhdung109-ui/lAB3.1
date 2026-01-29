/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */

    
import java.util.Scanner;

public class cau4 {
    private double radius;

    // Nhập bán kính
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        radius = sc.nextDouble();
    }

    // Tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Tính chu vi
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Kiểm tra hình tròn lớn (diện tích > 100)
    public boolean isBigCircle() {
        return getArea() > 100;
    }

    // HÀM MAIN - để chạy chương trình
    public static void main(String[] args) {
        cau4 c = new cau4();

        c.input();

        System.out.println("Diện tích hình tròn: " + c.getArea());
        System.out.println("Chu vi hình tròn: " + c.getPerimeter());

        if (c.isBigCircle()) {
            System.out.println("Đây là hình tròn lớn");
        } else {
            System.out.println("Đây là hình tròn nhỏ");
        }
    }
}

