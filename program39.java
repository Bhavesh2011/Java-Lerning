import java.util.Scanner;

class DisplayTheArray
{
    public static int DisplayArray(int[] arr)
    {
        System.out.println("Accepted By these class :");
        int i = 0;
        int iSum = 0;
        for(i = 0; i < arr.length; i++)
        {
            iSum = iSum + arr[i];
            System.out.println(arr[i]);
        }
        
        return iSum;
    }
}

public class program39 
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
        int iAns = 0;

        DisplayTheArray obj1 = new DisplayTheArray();
        iAns = obj1.DisplayArray(num);

        System.out.println("The Summation is : " + iAns);
        
    }    
}
