package Arrays;

public class Basic_Array {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,11,17,23,33};
        System.out.print("Given Array :- ");
        display(arr);
    }
    public static void display(int[] arr)
    {
        System.out.print("[ ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
}
