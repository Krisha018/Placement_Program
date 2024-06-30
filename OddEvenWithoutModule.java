import java.util.Scanner;
public class OddEvenWithoutModule{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("entre a number");
        int n = sc.nextInt();
        int isOdd = n&1;
        System.out.println((isOdd==1)?"odd":"even");
    }
}



