import java.util.Scanner;

public class program8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int iNo = sc.nextInt();

        Display.Display(iNo);
    }    
}

class Display
{
    public static void Display(int iVal)
    {
        int i = 0;

        for(i = 0; i <= iVal ; i++)
        {
            System.out.println(i + " : Hello");
        }
    }
}
