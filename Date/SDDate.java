package DatePackage;

import java.util.Scanner;

public class SDDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Date date1 = new Date();
        date1.hienThi();

        Date date2 = new Date(05, 10, 2002);
        date2.hienThi();

        Date date3 = new Date();
        date3.nhap();
        date3.hienThi();

        Date date4 = new Date();
        date4 = date3.ngayHomSau();
        date4.hienThi();

        Date date5 = new Date();
        System.out.print("Nhap so ngay can cong: ");
        int n = sc.nextInt();
        date5 = date4.congNgay(n);
        System.out.println(date5.toString());
    }
}