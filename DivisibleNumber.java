import java.util.Scanner;
public class DivisibleNumber{
    public static void main(String[] args)
    {
        int a=150;
        int b=445;
        for(int i=0;i<=b;i++)
        {
            if(i%2==0)
            {
                if(i%7==0 && i%3!=0)
                {
                    System.out.println(i);
                }
            }
        }

    }
}