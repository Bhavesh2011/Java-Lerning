import java.util.Scanner;

public class program35
{
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int iRow = Sc.nextInt();
        System.out.println("Enter The Character u want to display : ");
        char ch = Sc.next().charAt(0);
        Display.DisplayPattern(iRow , ch);
        
    }
    
}

class Display
{
    public static void DisplayPattern(int iNo , char ch)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        int i = 0;
        for(i = 1; i <= iNo; i++)
        {
            System.out.print(ch + " ");
        }

    }
}
