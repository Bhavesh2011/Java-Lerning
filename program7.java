import java.util.Scanner;

public class program7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int iVal = sc.nextInt();

        Display.Display(iVal);

    }    
}

class Display
{
    public static void Display(int iVal)
    {
        int i = 0;

        for(i = 0; i <= iVal; i++)
        {
            System.out.println(i);
        }
    }
}