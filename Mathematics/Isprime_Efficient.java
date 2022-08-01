package Mathematics;

import java.util.Scanner;

public class Isprime_Efficient {
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

    private static boolean is_prime(int num)
    {
        if (num==1)
            return false;
        for (int i=2;i*i<=num;i++)
        {
            if (num%i==0)
                return false;
        }
        return true;
    }
}
