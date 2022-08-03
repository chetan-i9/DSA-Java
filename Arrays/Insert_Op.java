package Arrays;

import java.util.Scanner;

public class Insert_Op {
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

        System.out.print("Before Insertion: ");
        Basic_Array.display(arr);

        System.out.print("\nEnter the element to be Inserted: ");
        int num=input.nextInt();
        System.out.print("Enter the position: ");
        int pos=input.nextInt();

        insert(arr,n,cap,num,pos);
        System.out.print("After- Insertion: ");
        Basic_Array.display(arr);
    }
    private static void insert(int[] arr,int n,int cap,int num, int pos)
    {
        if(n == cap)
            System.out.println("The element can't be inserted as the array is full.");

        int idx = pos - 1;
        for(int i = n - 1; i >= idx; i--)
        {
            arr[i + 1] = arr[i];
        }
        arr[idx] = num;
    }
}
