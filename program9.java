import java.util.Scanner;

public class program9 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int iNo = sc.nextInt();

        int iAns = 0;

        iAns = Display.Display(iNo);


        System.out.println("The Summation is : "+iAns);
    }    
}

class Display
{
    public static int Display(int iVal)
    {
        int i = 0;
        int iSum = 0;

        for(i = 0; i <= iVal ; i++)
        {
            iSum = iSum + i;
        }

        return iSum;
    }
}
