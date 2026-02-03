import java.util.Scanner;

public class program28
{
    public static void main(String[] args) 
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int iRow = Sc.nextInt();
        Display.DisplayPattern(iRow);
        
    }
    
}

class Display
{
    public static void DisplayPattern(int iNo)
    {
        if(iNo < 0)
        {
            iNo = -iNo;
        }
        int i = 0;
        for(i = 1; i <= iNo; i++)
        {
            System.out.print("*  ");
        }

    }
}
