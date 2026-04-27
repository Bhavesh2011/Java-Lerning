public class program5 
{
    public static void main(String[] args)
    {
        int num1 = 10;
        if(num1 < 9)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("false");
        }

        int bflag = 3;
        switch (bflag) 
        {
            case 3:
                System.out.println("true");
                break;
            case 4:
                System.out.println("false");
                break;
        
            default:
                System.out.println("its ookkk");
                break;
        }

        //Ternary Operator

        int n= 5;
        int re = 0;

        re = n%2 == 0 ? 10 : 20;

        // If true then 10 if false then 20

        System.out.println(re);
        
    }    
}
