import java.util.Scanner;

public class program14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");

        int iNo = sc.nextInt();

        long iFact = Factorial.Factorial(iNo);
        if(iFact == -1)
        {
            System.out.println("Enter The Proper Input");

        }
        else
        {
             System.out.println("Factorial of : " + iNo + " is " + iFact);
        }

       

    }    
}

class Factorial
{
    public static long Factorial(int ival)
    {
        if(ival < 0)
        {
            return -1;
        }
        long iAns = 1;

        int i = 1;

        for(i = 1; i <= ival; i++)
        {
            iAns = iAns * i;
        }


        return iAns;
    }
}
