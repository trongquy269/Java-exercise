import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class App
{
    public int charToNumber(char c)
    {
        if (Character.isWhitespace(c))
        {
            return 0;
        }
        char charUpperCase = Character.toUpperCase(c);
        int numerInAscii = charUpperCase;
        if ((65 <= numerInAscii) && (numerInAscii <= 67))
        {
            return (2 * 10 + (numerInAscii - 64));
        }
        else if (numerInAscii <= 70)
        {
            return (3 * 10 + (numerInAscii - 67));
        }
        else if (numerInAscii <= 73)
        {
            return (4 * 10 + (numerInAscii - 70));
        }
        else if (numerInAscii <= 76)
        {
            return (5 * 10 + (numerInAscii - 73));
        }
        else if (numerInAscii <= 79)
        {
            return (6 * 10 + (numerInAscii - 76));
        }
        else if (numerInAscii <= 83)
        {
            return (7 * 10 + (numerInAscii - 79));
        }
        else if (numerInAscii <= 86)
        {
            return (8 * 10 + (numerInAscii - 83));
        }
        else if (numerInAscii <= 90)
        {
            return (9 * 10 + (numerInAscii - 86));
        }
        else
        {
            return -1;
        }
    }

    public void process(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            int number = charToNumber(s.charAt(i));
            if (number <= 0)
            {
                System.out.print(number);
            }
            int numberOption = number / 10;
            int amount = number % 10;

            for (int j = 1; j <= amount; j++)
            {
                System.out.print(numberOption);
            }
            System.out.print(" ");
        }
    }

    public static void main(String[] args)
    {
        App app = new App();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chu: ");
        String s = sc.nextLine();
        System.out.print("Xuat: ");
        app.process(s);
    }
}