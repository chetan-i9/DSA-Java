package Mathematics;

import java.util.Scanner;

public class Trailzero_Factorial {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        int res=count_zero(num);

        System.out.println("The number of trailing zeroes in factorial of given number is "+res);
    }

    private static int count_zero(int num)
    {
        int fact=Factorial_iter.factorial(num);
        int res=0;
        while (fact%10==0)
        {
            res++;
            fact=fact/10;
        }
        return res;
    }
}
