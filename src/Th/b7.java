package Th;
import java.sql.SQLOutput;
import java.util.Scanner;
public class b7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        System.out.println("Nhập số để lựa chọn thao tác muốn thực hiện từ menu dưới dây: ");
        System.out.println("1.Tính chu vi và diện tích của hình chữ nhật.");
        System.out.println("2.Tính chu vi và diện tích hình tam giác");
        System.out.println("3.Tính chu vi và diện tích hình tròn.");
        System.out.println("4.Thoát");
        menu = sc.nextInt();
        switch (menu) {
            case 1:
                System.out.print("Nhập chiều dài hcn: ");
                double width = sc.nextDouble();
                System.out.print("Nhập chiều rộng hcn: ");
                double height = sc.nextDouble();
                hcn(width, height);
                break;
            case 2:
                System.out.print("Nhập độ dài cạnh thứ nhất: ");
                double a = sc.nextDouble();
                System.out.print("Nhập độ dài cạnh thứ hai: ");
                double b = sc.nextDouble();
                System.out.print("Nhập độ dài cạnh thứ ba: ");
                double c = sc.nextDouble();
                tamgiac(a, b, c);
                break;
            case 3:
                System.out.print("Nhập bán kính đường tròn: ");
                double r = sc.nextDouble();
                tron(r);
                break;
            case 4:
                System.exit(0);
                break;
        }

    }

    public static void hcn(double width, double height) {
        System.out.println("Chu vi của hình chữ nhật là " + 2 * (width + height));
        System.out.println("Diện tích của hình chữ nhật là " + (width * height));
    }

    public static void tamgiac(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) + p * (p - b) + p * (p - c));
        System.out.println("Chu vi của hình tam giác là: " + (2 * p));
        System.out.println("Diện tích của hình tam giác là: " + s);
    }
    public static void tron(double r) {
        System.out.println("Chu vi của hình tròn là:" + 2 * Math.PI * r);
        System.out.println("Diện tích của hình tròn là:" + Math.PI * Math.pow(r, 2));
    }
}
