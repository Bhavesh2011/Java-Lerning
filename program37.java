import java.util.Scanner;

public class program37 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter How many Numbers of input You want to take in these : ");
        int j = 0;
        j = sc.nextInt();
        int[] num = new int[j];
        System.out.println("Enter The Values of the Array : ");
        for(i = 0; i < j; i++)
        {
            num[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for (i = 0; i < j; i++)
        {
            System.out.print(num[i] + " ");
        }
    }    
}
