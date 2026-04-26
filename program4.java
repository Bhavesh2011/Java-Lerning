public class program4 
{
    public static void main(String[] args) 
    {

        int num1 = 0b101; // binary = 5;
        System.out.println(num1);

        int num2 = 0x10; // hexadecimal = 16
        System.out.println(num2);

        byte b = 127;
        int a = 12;
        byte k = (byte)a; // if suppose the variable is outoff range of byte then it divide by 256 and remainder is get store
        System.out.println(k);

        
    }    
}
