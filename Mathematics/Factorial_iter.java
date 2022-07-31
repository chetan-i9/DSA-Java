package Mathematics;

import java.util.Scanner;

public class Factorial_iter {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner input=new Scanner(System.in);

        int num=input.nextInt();
        int res=factorial(num);

        System.out.println("The factorial of given number is :- "+res);
    }

    public static int factorial(int num)
    {
        int res=1;
        for (int i=2;i<=num;i++)
        {
            res=res*i;
        }
        return res;
    }
}
