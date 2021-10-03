import java.util.Arrays;
import java.util.Scanner;

public class pat005
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        boolean[] values = new boolean[10000];
        int []number = new int[count];
        for (int i = 0; i < count; i++)
        {
            number[i] = input.nextInt();
            int anumber = number[i];
            while(anumber != 1)
            {
                if(anumber % 2 == 0)
                {
                    anumber /= 2;
                    values[anumber] = true;
                }
                else
                {
                    anumber = (anumber * 3 + 1) / 2;
                    values[anumber] = true;
                }
            }
        }
        Arrays.sort(number);
        int a = 0;
        for (int i = number.length - 1; i >= 0; i--)
        {
            if(values[(number[i])] == false)
            {
                if(a == 0)
                {
                System.out.printf("%d",number[i]);

                }
                else
                {
                System.out.printf(" %d",number[i]);
                }
                a++;
            }
        }
        input.close();
    }
}
