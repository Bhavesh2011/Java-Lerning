import java.util.Scanner;

public class program12
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int iNo = sc.nextInt(); 
        int iAns = 0;

        iAns = Factorial.Fatorial(iNo);

        System.out.println("The Factorial of : "+iNo + " is : " + iAns);
    }
    

}

class Factorial
{
    public static int Fatorial(int iVal)
    {
        int iAns = 1;

        for(int i = 1; i <= iVal ; i++)
        {
            iAns = iAns * i;
        }

        return iAns;
    }
}
