import java.util.Scanner;


class ArrayOperation
{
    public static boolean CheckNUmber(int[] Arr , int iNo)
    {
        boolean bFlag = false;
        int i = 0;
        for(i = 0; i < Arr.length; i++)
        {
            if(iNo == Arr[i])
            {
                bFlag = true;
                return bFlag;
            }
        }
        return bFlag;
    }
}

public class program40 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int iLimit = 0;
        int iCheckNumber = 0; 
        System.out.println("Enter How Much Element do u want in ur array");
        iLimit = sc.nextInt();
        int[] arr = new int[iLimit];
        int i = 0;
        int k = 0;

        for(i = 0 , k = 0; i < iLimit; i++ , k++)
        {
            System.out.print(k+1 + ": Enter the Number ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter The Number u Wnat to Search");
        iCheckNumber = sc.nextInt();


        for(i = 0; i < iLimit; i++)
        {
            System.out.println(arr[i]);
        }

        boolean bAns = ArrayOperation.CheckNUmber(arr, iCheckNumber);

        if(bAns == true)
        {
            System.out.println(iCheckNumber + " is Found");

        }
        if(bAns == false)
        {
            System.out.println(iCheckNumber + " Is Not Found");
        }
            

    }
}
