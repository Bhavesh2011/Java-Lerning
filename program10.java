import java.util.Scanner;

public class program10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int iNo = 0;
        iNo = sc.nextInt();
        boolean bAns = false;
        bAns = CheckEven.Checkeven(iNo);

        if(bAns == true)
        {
            System.out.println(iNo + " Is Even Number");
        }
        else
        {
            System.out.println(iNo + " is odd Number");
        }

    }    
}

class CheckEven
{
    public static boolean Checkeven(int iVal)
    {
        boolean bFlag = false;
        
        if(iVal % 2 == 0)
        {
            bFlag = true;

        }
        
        return bFlag;

    }
}
