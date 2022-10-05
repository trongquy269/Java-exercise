package DatePackage;

import java.util.Scanner;

public class Date {
    private int date, month, year;

    public Date () {
        date = month = year = 1;
    }

    public Date (int d, int m, int y)
    {
        date = d;
        month = m;
        year = y;
    }

    public Date (Date d)
    {
        date = d.date;
        month = d.month;
        year = d.year;
    }

    public void hienThi () {
        if (year == 0) {
            System.out.println(date + "/" + month + "/Nam CN");
        } else if (year < 0) {
            System.out.println(date + "/" + month + "/" + -year + " TCN");
        } else {
            System.out.println(date + "/" + month + "/" + year);
        }
    }

    public boolean hopLe () {
        boolean check = false;
        int limitDate[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean namNhuan;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    namNhuan = true;
                } else {
                    namNhuan = false;
                }
            } else {
                namNhuan = true;
            }
        } else {
            namNhuan = false;
        }
        if (namNhuan == true) {
            limitDate[2] = 29;
        }
        if ((month > 0) && (month <=12) && (date > 0) && (date <= limitDate[month])) {
            check = true;
        }
        return check;
    }

    public void nhap () {
        Scanner sc = new Scanner(System.in);
        do {
            boolean check = true;
            do {
                String d = "";
                String m = "";
                String y = "";
                System.out.print("Nhap ngay: ");
                d = sc.nextLine();
                System.out.print("Nhap thang: ");
                m = sc.nextLine();
                System.out.print("Nhap nam: ");
                y = sc.nextLine();
                try {
                    check = false;
                    date = Integer.parseInt(d);
                    month = Integer.parseInt(m);
                    year = Integer.parseInt(y);
                } catch (Exception e) {
                    System.out.println("Nhap sai dinh dang!");
                    check = true;
                }
            } while (check);
        } while (!hopLe());
    }

    public Date ngayHomSau () {
        Date tomorrow = new Date(date, month, year);
        tomorrow.date++;
        if (!tomorrow.hopLe()) {
            tomorrow.date = 1;
            tomorrow.month++;
            if (!tomorrow.hopLe()) {
                tomorrow.month = 1;
                tomorrow.year++;
            }
        }
        return tomorrow;
    }

    public Date congNgay (int n) {
        Date dateAfer = new Date(date, month, year);
        for (int i = 1; i <= n; i++) {
            dateAfer = dateAfer.ngayHomSau();
        }
        return dateAfer;
    }

    public String toString () {
        String s = "";
        if (year == 0) {
            s = (date + "/" + month + "/Nam CN");
        } else if (year < 0) {
            s = (date + "/" + month + "/" + -year + " TCN");
        } else {
            s = (date + "/" + month + "/" + year);
        }
        return s;
    }

    public int layNgay () {
        return date;
    }

    public int layThang () {
        return month;
    }

    public int layNam () {
        return year;
    }
}