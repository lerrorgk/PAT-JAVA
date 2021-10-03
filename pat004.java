import java.util.Scanner;

public class pat004 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String cou = input.nextLine();
        int count = Integer.valueOf(cou);
        String nameMax = "a", idMax = "b", nameMin = "c", idMin = "d";
        String allData;
        int max = 0, min = 100;
        int i = 0;
        while (i < count)
        {
            allData = input.nextLine();
            String [] temp = allData.split("\\s+");
            int number = Integer.valueOf(temp[2]);
            if(number >= max) 
            {
                max = number;
                nameMax = temp[0];
                idMax = temp[1];
            }
            if(number <= min) 
            {
                min = number;
                nameMin = temp[0];
                idMin = temp[1];
            }
            i++;
        }
        System.out.printf("%s %s\n", nameMax, idMax);
        System.out.printf("%s %s", nameMin, idMin);
        input.close();
    }
}
