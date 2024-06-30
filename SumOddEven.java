import java.util.Scanner;
public class SumOddEven{
    public static void main(String[] args)
    {
        int sumO=0,sumE=0;
         Scanner s = new Scanner(System.in);
        System.out.println("Enter n");
        int n=s.nextInt();

        int[] a=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
          for(int i = 0; i < n; i++)
          {
             if(a[i] % 2 == 0)
             {
                 sumE = sumE + a[i];       
             }
             else
             {
                sumO=sumO+a[i];

             }
           
          }
          System.out.println("Sum of Odd Numbers:"+sumO);
        System.out.println("Sum of Even Numbers:"+sumE);




    }
}



