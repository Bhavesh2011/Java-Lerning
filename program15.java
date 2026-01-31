import java.util.Scanner;

public class program15 
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
            System.out.println("Give The Proper Input");
            return;
        }

        int i = 1;

        for(i = 1; i < iVal; i++)
        {
            if((iVal % i) == 0)
            {
                System.out.println(i);
            }
        }
    }
}
