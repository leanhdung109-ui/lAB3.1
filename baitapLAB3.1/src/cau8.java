/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class cau8 {
    private String title;
    private String author;
    private double price;
    private int year;

    // Nhập thông tin sách
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tiêu đề sách: ");
        title = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        author = sc.nextLine();
        System.out.print("Nhập giá sách: ");
        price = sc.nextDouble();
        System.out.print("Nhập năm xuất bản: ");
        year = sc.nextInt();
    }

    // Hiển thị thông tin sách
    public void display() {
        System.out.println("Title: " + title
                + " - Author: " + author
                + " - Price: " + price
                + " - Year: " + year);
    }

    // Kiểm tra sách đắt tiền
    public boolean isExpensive() {
        return price > 200000;
    }

    // Kiểm tra sách cũ
    public boolean isOldBook() {
        return year < 2015;
    }

    // HÀM MAIN - chạy chương trình
    public static void main(String[] args) {
        cau8 book = new cau8();

        book.input();
        book.display();

        if (book.isExpensive()) {
            System.out.println("Đây là sách đắt tiền");
        } else {
            System.out.println("Đây là sách giá rẻ");
        }

        if (book.isOldBook()) {
            System.out.println("Đây là sách cũ");
        } else {
            System.out.println("Đây là sách mới");
        }
    }
}

    

