package Th;
import java.util.Scanner;
public class b2 {
    public static void main(String[] args) {
        //  BÀI TẬP
        // Hiển thị các loại hình
        Scanner sc = new Scanner(System.in);
        int menu;
        System.out.println("Nhập số để lựa chọn loại hình muốn in từ menu dưới dây: ");
        System.out.println("1. Hình chữ nhật");
        System.out.println("2. Hình tam giác cân góc trên");
        System.out.println("3. Hình tam giác cân góc dưới");
        System.out.println("4. Hình tam giác cân");
        menu = sc.nextInt();
        if (menu == 1) {
            System.out.println("Vẽ hình chữ nhật");
            System.out.print("Nhập chiều rộng: ");
            int width = sc.nextInt();
            System.out.print("Nhập chiều cao: ");
            int height = sc.nextInt();
            hcn(width, height);
        } else if (menu == 2) {
            System.out.println("Vẽ hình tam giác cân góc dưới");
            System.out.print("Nhập chiều dài cạnh góc vuông: ");
            int width = sc.nextInt();
            bot(width);
        } else if (menu == 3) {
            System.out.println("Vẽ hình tam giác cân góc trên");
            System.out.print("Nhập chiều dài cạnh góc vuông: ");
            int width = sc.nextInt();
            top(width);
        } else if (menu == 4) {
            System.out.println("Vẽ hình tam giác cân ");
            System.out.print("Nhập chiều dài cạnh góc vuông: ");
            int height = sc.nextInt();
            mid(height);
        }
    }
    public static void hcn(int width, int height) {
        System.out.println("KẾT QUẢ:");
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void bot(int width) {
        System.out.println("KẾT QUẢ:");
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void top(int width) {
        System.out.println("KẾT QUẢ:");
        for (int i = 1; i <= width; i++) {
            for (int j = width - i + 1; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void mid(int height  ) {
        System.out.println("KẾT QUẢ:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i+height; j++) {
                if (j < height-i-1){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
