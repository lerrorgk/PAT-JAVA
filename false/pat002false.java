import java.util.Scanner;

public class pat002false
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        long sum = 0;
        long a;
        long b = 10;
        long c = 10;
        long d = 1;
        long e = 0;
        long number = input.nextInt();
        while(number / b != 0)
        {
            a = (number % b) / (b / 10);
            sum = sum + a;
            b = b * 10;
        }
        sum = sum + number / (b / 10);
        while(sum / c != 0)
        {
            c = c * 10;
            d++;
        }
        c = c / 10;
        while(d > e)
        {
            if((sum / c) - ((sum / (c * 10)) * 10) == 1)
            {
                System.out.printf("yi ");
            }
            if((sum / c) - ((sum / (c * 10)) * 10) == 2)
            {
                System.out.printf("er ");
            }
            if((sum / c) - ((sum / (c * 10)) * 10) == 3)
            {
                System.out.printf("san ");
            }
            if((sum / c) - ((sum / (c * 10)) * 10) == 4)
            {
                System.out.printf("si ");
            }
            if((sum / c) - ((sum / (c * 10)) * 10) == 5)
            {
                System.out.printf("wu ");
            }
            if((sum / c) - ((sum / (c * 10)) * 10) == 6)
            {
                System.out.printf("liu ");
            }
            if((sum / c) - ((sum / (c * 10)) * 10) == 7)
            {
                System.out.printf("qi ");
            }
            if((sum / c) - ((sum / (c * 10)) * 10) == 8)
            {
                System.out.printf("ba ");
            }
            if((sum / c) - ((sum / (c * 10)) * 10) == 9)
            {
                System.out.printf("jiu ");
            }
            if((sum / c) - ((sum / (c * 10)) * 10) == 0)
            {
                System.out.printf("ling ");
            }
            c = c / 10;
            d--;
        }
        input.close();
    }
}
