package Mathematics;

import java.util.Scanner;

public class LCM_Efficient {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Number1: ");
        int x=input.nextInt();
        System.out.print("Enter Number2: ");
        int y=input.nextInt();

        int res=lcm(x,y);
        System.out.println("The LCM of given numbers is "+res);
    }
    private static int lcm(int a, int b)
    {
        int gcd=GCD_optimized.gcd(a,b);
        return (a*b)/gcd;
    }
}
