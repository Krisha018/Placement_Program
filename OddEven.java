import java.util.Scanner;
public class OddEven{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
       

        System.out.println("Enter n");
        int n=a.nextInt();

        if((n & 1) == 1) 
        {
            System.out.println("The number " + n + " is an odd number");
        }
        else 
        {
            System.out.println("The number " + n + " is an even number");
        }
    }
}



