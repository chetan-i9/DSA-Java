package Mathematics;

import java.util.Scanner;

public class Prime_Factors_Efficient
{
    public static void main(String[] args) {
        System.out.print("Enter any Number:");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        prime_factors(num);

    }
    private static void prime_factors(int num)
    {
        if (num<=1)
            return;
        while (num%2==0)
        {
            System.out.print("2 ");
            num=num/2;
        }
        while (num%3==0)
        {
            System.out.print("3 ");
            num=num/3;
        }
        for (int i=5;i*i<=num;i++)
        {
            while (num%i==0)
            {
                System.out.print(i+" ");
                num=num/i;
            }
            while (num%(i+2)==0)
            {
                System.out.print((i+2)+" ");
                num=num/(i+2);
            }
        }
        if (num>3)
            System.out.print(num);
    }
}
