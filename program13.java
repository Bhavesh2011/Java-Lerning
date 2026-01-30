import java.util.Scanner;

public class program13 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");

        int iNo = sc.nextInt();

        long iFact = Factorial.Factorial(iNo);

        System.out.println("Factorial of : " + iNo + " is " + iFact);

    }    
}

class Factorial
{
    public static long Factorial(int ival)
    {
        long iAns = 1;

        int i = 1;

        for(i = 1; i <= ival; i++)
        {
            iAns = iAns * i;
        }


        return iAns;
    }
}
