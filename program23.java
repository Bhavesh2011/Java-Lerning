import java.util.Scanner;

public class program23 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int no = sc.nextInt();

        boolean bAns = CheckPerfect.checkPerfect(no);
        if(bAns == true)
        {
            System.out.println(no + " is perfect number");
        }
        else
        {
            System.out.println(no + " is Not perfect number");
        }

    }    
}

class CheckPerfect
{
    public static boolean checkPerfect (int iNo)
    {
        boolean bFalg = false;
        int i = 0;
        int iAns = 0;
        for(i = 1; i <= (iNo / 2); i++)
        {
            if(iNo % i == 0)
            {
                iAns = iAns + i;
            }
        }

        if(iAns == iNo)
        {
            bFalg = true;
        }
        return bFalg;
    }
}
