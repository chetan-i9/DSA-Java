package Mathematics;

import java.util.Scanner;

public class Count_Digits_log {
    public static void main(String[] args) {
        System.out.print("Enter any number:");
        Scanner input= new Scanner(System.in);

        int num=input.nextInt();
        int res=count_digits(num);
        System.out.println("The number of digits in given number is "+res);
    }

    private static int count_digits(int num)
    {
         return (int) Math.floor(Math.log10(num)+1);
    }
}
