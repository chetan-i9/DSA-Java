package Mathematics;

import java.util.Scanner;

public class LCM_Naive {
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
        int res=Math.max(a,b);
        while(true)
        {
            if (res%a==0 && res%b==0) {
                return res;
            }
            res++;
        }
    }
}
