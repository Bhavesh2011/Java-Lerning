import java.util.Scanner;

public class program20
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");

        int iVal = sc.nextInt();

        int iAns = Factors.DisplayandSumFactor(iVal);

        System.out.println("Summation is : " + iAns);

    }
}

class Factors
{
    public static int DisplayandSumFactor(int iVal)
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

                System.out.println(i + " is Factor");
                iSum = iSum + i;
            
            }
        }

        return iSum;
    }

}
