import java.util.Scanner;

public class program21
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");

        int iVal = sc.nextInt();

        boolean bAns = Factors.CheckPerfect(iVal);

        if(bAns == true)
        {
            System.out.println(iVal + " is prefect number");
        }
        else
        {
            System.out.println(iVal + " is not perfect Number");
        }

    }
}

class Factors
{
    public static boolean CheckPerfect(int iVal)
    {
        boolean bFalg = false;

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

        if(iSum == iVal)
        {
            bFalg = true;
        }

        return bFalg;
    }
    
}
