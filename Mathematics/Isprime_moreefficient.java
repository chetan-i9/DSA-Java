package Mathematics;

import java.util.Scanner;

public class Isprime_moreefficient {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner input= new Scanner(System.in);

        int num= input.nextInt();
        if (is_prime(num))
        {
            System.out.println("The given number is a Prime Number.");
        }
        else
        {
            System.out.println("The given number is not a Prime Number.");
        }
    }

    public static boolean is_prime(int num)
    {
        if (num==1)
            return false;
        if (num==2 || num==3)
            return true;
        if (num%2==0 || num%3==0)
            return false;
        for (int i=5;i*i<=num;i=i+6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
    }
}
