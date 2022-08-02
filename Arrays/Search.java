package Arrays;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of elements in an array: ");
        int n=input.nextInt();

        int[] arr=new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
            arr[i]=input.nextInt();
        }

        System.out.print("Enter the element to be searched in an array: ");
        int num=input.nextInt();
        int res=search(arr,num);
        if (res==-1)
        {
            System.out.println("The element is not present in the array.");
        }
        else {
            System.out.println("The element "+arr[res]+" is present at position "+(res+1));
        }

    }

    private static int search(int[] arr,int num)
    {
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==num)
            {
                return i;
            }
        }
        return -1;
    }
}
