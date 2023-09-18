package Th;

import java.util.Scanner;

public class b4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int cout = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while (cout < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                cout++;
            }
            i++;
        }
    }
    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
