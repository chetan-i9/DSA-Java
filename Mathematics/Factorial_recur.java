package Mathematics;

import java.util.Scanner;

public class Factorial_recur {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner input= new Scanner(System.in);

        int num=input.nextInt();
        int res=factorial(num);

        System.out.println("The factorial of a given number: "+res);
    }

    private static int factorial(int num)
    {
        if (num==0)
        {
            return 1;
        }
        else
        {
            return num*factorial(num-1);
        }
    }
}
