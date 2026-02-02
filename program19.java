import java.util.Scanner;

public class program19
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");

        int iVal = sc.nextInt();

        Factors.DisplayFactor(iVal);

        int iAns = Factors.SumFactor(iVal);

        System.out.println("Summation is : " + iAns);

    }
}

class Factors
{
    public static void DisplayFactor(int iVal)
    {
        if(iVal < 0)
        {
           iVal = -iVal;
        }

        int i = 1;
        

        for(i = 1; i < iVal; i++)
        {
            if((iVal % i) == 0)
            {

                System.out.println(i + " is Factor");
            
            }
        }
    }

    public static int SumFactor(int iVal)
    {
        if(iVal < 0)
        {
           iVal = -iVal;
        }

        int i = 1;
        int iSum = 0;
        

        for(i = 1; i < iVal; i++)
        {
            if((iVal % i) == 0)
            {

                iSum = iSum + i;
            }
            
        }

        return iSum;

    }
}
