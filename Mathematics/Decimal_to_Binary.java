package Mathematics;

import java.util.Scanner;

public class Decimal_to_Binary {
    public static void main(String[] args) {
        System.out.print("Enter any Number: ");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        System.out.print("Binary Form of the number is- ");
        dec_to_bin(num);
    }
    private static void dec_to_bin(int num)
    {
        if (num==0)
            return;
        dec_to_bin(num/2);
        System.out.print(num%2);
    }
}
