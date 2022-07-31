package Mathematics;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        System.out.print("Enter any number :");
        Scanner input=new Scanner(System.in);

        int num=input.nextInt();
        if (is_palindrome(num))
        {
            System.out.println("The given number is a Palindrome.");
        }
        else
        {
            System.out.println("The given number is not a Palindrome.");
        }
    }

    private static boolean is_palindrome(int num)
    {
        int rev=0;
        int temp=num;
        while (temp!=0)
        {
            int ld=temp%10;
            rev=rev*10+ld;
            temp=temp/10;
        }
        return (num==rev);
    }
}
