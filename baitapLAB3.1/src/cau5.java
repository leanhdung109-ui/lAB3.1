/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class cau5 {
    private String accountNumber;
    private String ownerName;
    private double balance;

    // Nhập thông tin tài khoản
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tài khoản: ");
        accountNumber = sc.nextLine();
        System.out.print("Nhập tên chủ tài khoản: ");
        ownerName = sc.nextLine();
        System.out.print("Nhập số dư ban đầu: ");
        balance = sc.nextDouble();
    }

    // Nạp tiền
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Rút tiền (chỉ rút khi đủ tiền)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Không đủ tiền để rút!");
        }
    }

    // Kiểm tra số dư
    public double checkBalance() {
        return balance;
    }

    // Hiển thị thông tin tài khoản
    public void display() {
        System.out.println("STK: " + accountNumber
                + " - Chủ tài khoản: " + ownerName
                + " - Số dư: " + balance);
    }

    // HÀM MAIN - chạy chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cau5 acc = new cau5();

        acc.input();
        acc.display();

        System.out.print("Nhập số tiền nạp: ");
        double nap = sc.nextDouble();
        acc.deposit(nap);
        acc.display();

        System.out.print("Nhập số tiền rút: ");
        double rut = sc.nextDouble();
        acc.withdraw(rut);
        acc.display();

        System.out.println("Số dư hiện tại: " + acc.checkBalance());
    }
}

    

