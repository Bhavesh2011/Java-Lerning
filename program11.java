import java.util.*;

public class program11 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Number");
        int iNo = sc.nextInt();

        boolean bAns = CheckDivisibility.DivisibleBy5and3(iNo);

        if(bAns == true)
        {
            System.out.println("Yes " + iNo + " is Divisible");
        }
        else
        {

            System.out.println( "No "+ iNo + " is Not Divisible");
        }
    }
}

class CheckDivisibility
{
    public static boolean DivisibleBy5and3(int iNo)
    {
        boolean bFlag = false;

        if((iNo % 5 == 0) && (iNo % 3 ==0))
        {
            bFlag = true;

        }

        return bFlag;
    }
}
