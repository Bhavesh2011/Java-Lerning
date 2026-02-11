import java.util.Scanner;

class DisplayTheArray
{
    public static void DisplayArray(int[] arr)
    {
        System.out.println("Accepted By these class :");
        int i = 0;
        for(i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

public class program38 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.print("Enter The Limit : ");
        int j = 0;
        j = sc.nextInt();
        int[] num = new int[j];
        System.out.println("Enter The Elements : ");
        for(i = 0; i < j; i++)
        {
            num[i] = sc.nextInt();
        }
        i = 0;
        // System.out.println("Ur Elements are : ");
        // for(i = 0; i < j ; i++)
        // {
        //     System.out.println(num[i]);
        // }

        DisplayTheArray obj1 = new DisplayTheArray();
        obj1.DisplayArray(num);

        
    }    
}
