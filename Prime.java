import java.util.Scanner;
public class Prime{
     public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        
        System.out.println("Enter n1");
        int num=a.nextInt();
        
    
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
          
     
}


