import java.util.Scanner;

class DisplayArray
{

    public static void show(char[] arr) 
    {
        System.out.println("Characters in array:");

        for (char c : arr) 
        {
            System.out.println(c);
        }
    }
}


public class program43 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] ch = input.toCharArray();
        DisplayArray.show(ch);
        sc.close();
        
    }
}
