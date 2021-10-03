import java.util.Scanner;

public class pat001
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int number = input.nextInt();
        while(number != 1)
        {
            if(number % 2 == 0)
            {
                number = number / 2;
            }
            else
            {
                number = ((number * 3 + 1) / 2);
            }
            count++;
        }
        System.out.printf("%d\n", count);
        input.close();
    }
}
