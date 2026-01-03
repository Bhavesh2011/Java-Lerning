import java.util.Scanner;

public class program6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Interation");
        int iAns = 0;
        iAns = sc.nextInt();

        Display.Display(iAns);
    }    
}

class Display
{
    public static void Display(int iValue)
    {
        int i = 0;

        for(i = 1; i <= iValue; i++)
        {
            System.out.println("Hello");
        }
    }
}
