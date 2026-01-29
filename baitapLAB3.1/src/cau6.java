/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class cau6 {
    private String id;
    private String name;
    private double price;
    private int quantity;

    // Nhập thông tin sản phẩm
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID sản phẩm: ");
        id = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        name = sc.nextLine();
        System.out.print("Nhập giá: ");
        price = sc.nextDouble();
        System.out.print("Nhập số lượng: ");
        quantity = sc.nextInt();
    }

    // Tính tổng tiền
    public double getTotalPrice() {
        return price * quantity;
    }

    // Giảm giá theo %
    public void discount(double percent) {
        if (percent > 0 && percent <= 100) {
            price = price - price * percent / 100;
        }
    }

    // Hiển thị thông tin sản phẩm
    public void display() {
        System.out.println("ID: " + id
                + " - Name: " + name
                + " - Price: " + price
                + " - Quantity: " + quantity);
    }

    // HÀM MAIN - chạy chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cau6 p = new cau6();

        p.input();
        p.display();

        System.out.println("Tổng tiền: " + p.getTotalPrice());

        System.out.print("Nhập % giảm giá: ");
        double percent = sc.nextDouble();
        p.discount(percent);

        System.out.println("Sau khi giảm giá:");
        p.display();
        System.out.println("Tổng tiền mới: " + p.getTotalPrice());
    }
}

    

