/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class cau7 {
    private String brand;
    private String model;
    private int speed;

    // Nhập thông tin xe
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hãng xe: ");
        brand = sc.nextLine();
        System.out.print("Nhập model xe: ");
        model = sc.nextLine();
        speed = 0; // tốc độ ban đầu
    }

    // Tăng tốc
    public void accelerate(int value) {
        if (value > 0) {
            speed += value;
        }
    }

    // Giảm tốc (không < 0)
    public void brake(int value) {
        if (value > 0) {
            speed -= value;
            if (speed < 0) {
                speed = 0;
            }
        }
    }

    // Hiển thị trạng thái xe
    public void displayStatus() {
        System.out.println("Model: " + model + " - Speed: " + speed);
    }

    // Kiểm tra quá tốc độ (>100)
    public boolean isOverSpeed() {
        return speed > 100;
    }

    // HÀM MAIN - chạy chương trình
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cau7 car = new cau7();

        car.input();
        car.displayStatus();

        System.out.print("Nhập giá trị tăng tốc: ");
        int tang = sc.nextInt();
        car.accelerate(tang);
        car.displayStatus();

        System.out.print("Nhập giá trị giảm tốc: ");
        int giam = sc.nextInt();
        car.brake(giam);
        car.displayStatus();

        if (car.isOverSpeed()) {
            System.out.println("Xe đang chạy quá tốc độ!");
        } else {
            System.out.println("Tốc độ xe an toàn.");
        }
    }
}

    

