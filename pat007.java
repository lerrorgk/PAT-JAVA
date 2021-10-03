import java.util.Scanner;

public class pat007
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean [] numbers = new boolean[number + 1];
        int count = 0;
        if(number <= 4)
        {
        System.out.print("0");
        }
        else
        {
            for (int i = 3; i <= number; i++)
            {
                for (int j = 2; j * j <= i; j++)
                {
                    if(i % j == 0)
                    {
                        numbers[i] = true;
                        break;
                    }
                }
            }
            for (int i = 3; i <= number - 2; i++)
            {
                if(numbers[i] == false && numbers[i + 2] == false)
                {
                    count++;
                }
            }
        System.out.print(count);
        }
        input.close();
    }
}
