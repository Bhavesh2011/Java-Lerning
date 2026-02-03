import java.util.Scanner;

public class program26 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int iNo = 0;
        iNo = sobj.nextInt();
        int iAns =  0;
        iAns = CountDigit.DisplaySum(iNo);
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

    public static int DisplaySum(int iNo)
    {
        int iAns = 0;
        int iDigit = 0;
        int iSum = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            iSum = iSum + iDigit;
            
        }
        return iSum;
    }
}
