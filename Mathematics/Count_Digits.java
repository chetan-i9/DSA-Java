package Mathematics;

import java.util.*;

public class Count_Digits
{
    public static void main(String[] args) {
        System.out.print("Enter an number: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        int res=count_digits(num);
        System.out.println("The no. of digits in given number is "+res);
    }

    private static int count_digits(int num) {
        int count=0;
        while (num!=0)
        {
            num=num/10;
            count++;
        }
        return count;
    }
}
