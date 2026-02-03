import java.util.Scanner;

public class program25 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int iNo = 0;
        iNo = sobj.nextInt();
        int iAns =  0;
        iAns = CountDigit.CountEvenDigit(iNo);
        System.out.println(iAns);

    }    
}

class CountDigit
{
    public static int CountEvenDigit(int iNo)
    {
        int iAns = 0;
        int iDigit = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            if(iDigit % 2 == 0)
            {
                iAns++;
            }
            
        }
        return iAns;
    }
}
