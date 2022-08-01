package Mathematics;

import java.util.Scanner;

public class Sum_nNaturalNumbers {
    public static void main(String[] args) {
        System.out.print("Enter any Number: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        int res=sum(num);
        System.out.println("The sum of first "+num+" Natural Numbers is "+res);
    }

    private static int sum(int num)
    {
        if (num==0)
            return 0;
        else
            return num+sum(num-1);
    }
}
