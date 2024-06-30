import java.util.Scanner;
public class LastDigit{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a");
        int a=s.nextInt();

         System.out.println("Enter b");
        int b=s.nextInt();

        a=a%10;
        b=b%10;
        int c=a+b;
        System.out.println("Sum of Last Digits Numbers:"+c);

    }
}