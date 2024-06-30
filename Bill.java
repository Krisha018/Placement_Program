import java.util.Scanner;
public class Bill{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Amount");
        int a=s.nextInt();
        BillAmount(a);
    }


public static void BillAmount(int a)
{
    double Bill=0;
    if(a<=200)
    {
        Bill=a*0.80+100;
    }
    else if(a>=200 && a<=300)
    {
        Bill=(a-100)*0.80+(a-200)*0.90+100;
    }
    else if(a>=300)
    {
        Bill=(a-100)*0.80+(a-200)*0.90+(a-300)*1+100;
        Bill=(Bill*12.36)/100;
    }
    System.out.println(Bill);
}
}