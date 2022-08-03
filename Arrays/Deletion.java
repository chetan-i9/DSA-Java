package Arrays;

import java.util.Scanner;

public class Deletion {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the capacity of an array: ");
        int cap=input.nextInt();
        System.out.print("Enter the number of elements in an array: ");
        int n=input.nextInt();

        int[] arr=new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.print("Enter element "+(i+1)+": ");
            arr[i]=input.nextInt();
        }

        System.out.print("Before Deletion: ");
        Basic_Array.display(arr);

        System.out.print("Enter the element to be deleted: ");
        int num= input.nextInt();
        int idx=delete(arr,n,cap,num);
        System.out.print("After Deletion: ");
        System.out.print("[ ");
        for (int i=0;i<idx;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }

    private static int delete(int[] arr, int n, int cap, int num)
    {
        int i=0;
        for (i=0;i<n;i++)
        {
            if (arr[i]==num)
                break;
        }
        if (i==n) {
            System.out.println("The element doesn't exists.");
            return n;
        }

        for (int j=i;j<n-1;j++) {
            arr[j] = arr[j + 1];
        }

        return n-1;
    }
}
