package sang;
import java.util.Scanner;
public class b2 {
    public static boolean checkYear(int nam) {
        return (nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0;
    }
    public static void main(String[] args) {
        int month, year;
        Scanner input = new Scanner(System.in);
        System.out.print("Input month: ");
        month = input.nextInt();
        System.out.print("Input year: ");
        year = input.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("Tháng " + month + " có 31 ngày.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("Tháng " + month + " có 30 ngày.");
                break;
            case 2:
                if (checkYear(year)) {
                    System.out.print("Tháng " + month + " có 29 ngày.");
                } else {
                    System.out.print("Month " + month + " có 28 ngày.");
                }
                break;
            default:
                System.out.print("nhập mẹ lại tháng đi.");
        }
    }
}
