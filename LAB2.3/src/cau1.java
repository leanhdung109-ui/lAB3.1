import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap nam  sinh: ");
        int namSinh = sc.nextInt();

        int tuoi = 2025 - namSinh;

        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);

        if (tuoi >= 18) {
            System.out.println("đu tuoi lao dong ");
        } else {
            System.out.println("chua du tuoi lao dong ");
        }
    }
}
