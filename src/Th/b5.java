package Th;

import java.util.Scanner;

public class b5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 5 != 0 || i % 7 != 0 || i % 11 != 0) {
                continue;
            }
            System.out.println(i);
            break;
        }

    }
}
