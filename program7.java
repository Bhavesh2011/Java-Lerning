import java.util.*;

class Calculator
{
    public int addition(int a , int b)
    {
        int iresult = 0;
        iresult = a + b;
        return iresult;
    }

}

public class program7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter The 1st Number");
        int num1 = sc.nextInt();
        System.out.println("Enter The Second Number : ");
        int num2 = sc.nextInt();

        Calculator calc = new Calculator();
        int iAns = calc.addition(num1, num2); 
        System.out.println(iAns);   
        
    }    
}
