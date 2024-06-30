import java.util.Scanner;
public class Largest{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        
        System.out.println("Enter n1");
        int n1=a.nextInt();
        
        System.out.println("Enter n2");
        int n2=a.nextInt();
        
        System.out.println("Enter n3");
        int n3=a.nextInt(); 
        
        int sum=(n1>n2&&n1>n3?n1:n2>n3?n2:n3);
        
        System.out.println(sum);
       
    }

    
}