package Mathematics;

import java.util.Scanner;

public class Trailzero_Factorial_eff {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner input= new Scanner(System.in);
        int num=input.nextInt();
        int res=count_zero(num);

        System.out.println("The number of trailing zeroes in factorial of given number is "+res);
    }

    private static int count_zero(int num)
    {
        int res=0;
        for (int i=5;i<=num;i=i*5)
        {
            res=res+(num/i);
        }
        return res;
    }
}
