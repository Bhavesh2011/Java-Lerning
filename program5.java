import java.util.Scanner;

class Program5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Percentage: ");
        float fValue = sc.nextFloat();

        Percentage.DisplayClass(fValue);
    }
}


class Percentage
{
    public static void DisplayClass(float fPerc)
    {
        if ((fPerc < 0.0f) || (fPerc > 100.0f))
        {
            System.out.println("Unable to proceed because it is Invalid");
        }
        else if ((fPerc >= 0.0f) && (fPerc < 35.0f))
        {
            System.out.println("The candidate is Fail");
        }
        else if ((fPerc >= 35.0f) && (fPerc < 50.0f))
        {
            System.out.println("The candidate is Pass Class");
        }
        else if ((fPerc >= 50.0f) && (fPerc < 60.0f))
        {
            System.out.println("The candidate is Second Class");
        }
        else if ((fPerc >= 60.0f) && (fPerc < 70.0f))
        {
            System.out.println("The candidate is First Class");
        }
        else
        {
            System.out.println("The candidate is First Class with Distinction");
        }
    }
}
