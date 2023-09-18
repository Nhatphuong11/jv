package Th;
import java.util.Scanner;
public class b1 {
    public static void main(String[] args) {
        //      BÀI TẬP
        //      Tính tổng các số chẵn trong khoảng cho trước
        Scanner sc = new Scanner(System.in);
        System.out.println("tính tổng các số chẵn trong khoảng cho trước");
        int min, max, sum = 0;
        System.out.print("Nhập số đầu");
        min = sc.nextInt();
        System.out.print("Nhập số cuối");
        max = sc.nextInt();
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn trong khoảng từ " + min + " đến " + max + " là " + sum);
    }
}
