import java.util.Scanner;

public class pat006 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number / 100 != 0)
        {
            for(int i = 0; i < (number / 100); i++)
            {
                System.out.print("B");
            }
        }
        if(number / 10 != 0)
        {
            for(int i = 0; i < ((number / 10) - (number / 100) * 10); i++)
            {
                System.out.print("S");
            }
        }
        for(int i = 1; i <= (number % 10); i++)
        {
            System.out.print(i);
        }
        input.close();
    }
}
