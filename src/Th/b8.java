package Th;
import java.util.Scanner;
public class b8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a ,b, c = 0;
        do {
            System.out.print("Nhập cạnh thứ nhất: ");
            a = sc.nextDouble();
            System.out.print("Nhập cạnh thứ hai: ");
            b = sc.nextDouble();
            System.out.print("Nhập cạnh thứ ba: ");
            c = sc.nextDouble();
            if(!check(a, b, c)){
                System.out.println("Nhập lại: ");
            } else {
                tamgiac(a, b, c);
                break;
            }
        } while (!check(a, b, c));
    }
    public static boolean check(double a, double b, double c) {
        boolean test = true;
        if (a <= 0 || b <= 0 || c <= 0) {
            test = false;
        } else {
            if ((a + b) <= c || (b + c) <= a || (a + c) <= b) {
                test = false;
            }
        }
        return test;
    }
    public static void tamgiac(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) + p * (p - b) + p * (p - c));
        System.out.println("Chu vi của hình tam giác là: " + (2 * p));
        System.out.println("Diện tích của hình tam giác là: " + s);
    }
}
