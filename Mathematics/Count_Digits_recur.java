package Mathematics;

import java.util.Scanner;

public class Count_Digits_recur {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int res=count_digits(num);
        System.out.println("The no. of digits in given number is "+res);
    }

    private static int count_digits(int num)
    {
        if (num==0)
        {
            return 0;
        }
        else
        {
            return 1+count_digits(num/10);
        }
    }
}
