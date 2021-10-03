import java.util.Scanner;

public class pat003false
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        char[] c1 = s1.toCharArray();
        int countA = 0, countB = 0, countC = 0, i = 0;
        while(i < c1.length)
        {
            if(c1[i] != 'P' && c1[i] != 'A' && c1[i] != 'T')
            {
                System.out.println("NO");
                break;
            }
            i++;
        }
        i = 0;
        while(i < c1.length)
        {
            if(c1[i] == 'A' )
            {
                countA = countA + 1;
                i++;
            }
            else
            {
                break;
            }
        }
        i = i + 1;
        while((c1[i - 1] == 'P' )&& i < c1.length)
        {
            if(c1[i] == 'A' )
            {
                countB = countB + 1;
                i++;
            }
            else
            {
                break;
            }
        }
        i = i + 1;
        while((c1[i - 1] == 'T' )&& i < c1.length)
        {
            if(c1[i] == 'A' )
            {
                countC = countC + 1;
                i++;
            }
            else
            {
                break;
            }
        }

        if((countC == countA * countB && countC != 0) || countB == 1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        input.close();
    }
}
