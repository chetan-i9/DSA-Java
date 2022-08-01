package Mathematics;

import java.util.Scanner;

public class PrimeFactors_Naive {
    public static void main(String[] args) {
        System.out.print("Enter any Number:");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        prime_factors(num);
    }

    private static void prime_factors(int num)
    {
        for (int i=2;i<num;i++)
        {
            if (Isprime_moreefficient.is_prime(i)) {
                int x=i;
                while (num%x==0)
                {
                    System.out.print(i+" ");
                    x=x*i;
                }
            }
        }
    }
}
