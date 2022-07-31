package Mathematics;

import java.util.Scanner;

public class GCD_Naive {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int x=input.nextInt();
        System.out.print("Enter number 2: ");
        int y=input.nextInt();

        int res=gcd(x,y);
        System.out.println("The GCD of given two numbers is "+res);
    }

    private static int gcd(int a, int b)
    {
        int res=Math.min(a,b);
        while (res>0)
        {
            if (a%res==0 && b%res==0)
            {
                return res;
            }
            res--;
        }
        return res;
    }
}
