import java.util.Scanner;

public class program17
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");

        int iVal = sc.nextInt();

        Factors.DisplayFactor(iVal);

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
        

        for(i = 1; i <= iVal; i++)
        {
            if((iVal % i) == 0)
            {
                System.out.println(i + " is Factor");
            }
            else
            {
                System.out.println(i + " is not a factor");
            }
        }
    }
}
