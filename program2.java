import java.util.Scanner;

public class program2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int iMarks = sc.nextInt();

        int iAns = 0;

        iAns = ((iMarks / 100) * 100);

        System.out.println(iAns);
    }    
}
