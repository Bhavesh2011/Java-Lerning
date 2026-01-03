import java.util.Scanner;

public class program4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int iMarks = 0;
        iMarks = sc.nextInt();
        float fAns = 0;
        fAns = (((float)iMarks / 100)*100);

        System.out.print("Marks Obtained Are : " + fAns);

    }    
}
