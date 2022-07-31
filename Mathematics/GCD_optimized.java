package Mathematics;

import java.util.Scanner;

public class GCD_optimized {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number1 :");
        int x=input.nextInt();
        System.out.print("Enter number2 :");
        int y=input.nextInt();

        int res=gcd(x,y);
        System.out.println("The GCD of given numbers is: "+res);
    }

    public static int gcd(int a, int b)
    {
        if (b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }
}
