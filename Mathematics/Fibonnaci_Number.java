package Mathematics;

import java.util.Scanner;

public class Fibonnaci_Number {
    public static void main(String[] args) {
        System.out.print("Enter any Number: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        int res=fibonacci(num);
        System.out.println("The required Fibonacci Number is "+res);
    }
    private static int fibonacci(int num)
    {
        if (num<=1)
            return num;
        else
            return fibonacci(num-1)+fibonacci(num-2);
    }
}
