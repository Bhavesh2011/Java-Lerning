import java.util.Scanner;

public class program24 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int iNo = 0;
        iNo = sobj.nextInt();
        int iAns =  0;
        iAns = CountDigit.CountDigit(iNo);
        System.out.println(iAns);

    }    
}

class CountDigit
{
    public static int CountDigit(int iNo)
    {
        int iAns = 0;
        int iDigit = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            iAns++;
        }
        return iAns;
    }
}
