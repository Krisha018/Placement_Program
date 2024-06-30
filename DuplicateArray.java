import java.util.Scanner;

public class DuplicateArray{
    static int removeDuplicates(int arr[], int n)
   {
      if (n==0 || n==1)
         return n;
    int j = 0;
    for (int i=0; i<n-1; i++)
    if (arr[i] != arr[i+1])
    arr[j++] = arr[i];
    arr[j++] = arr[n-1];    

        return j;
   }
    public static void main(String[] args)
    {
         int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
         int n = arr.length;
        n = removeDuplicates(arr, n);
        for (int i=0; i<n; i++)
        {
                System.out.print(arr[i]+" ");

        }
}
}











//  int arr[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
//      int n = arr.length;
//      Set hash_Set = new HashSet();
// for (int i=0; i<n; i++)
// hash_Set.add(arr[i]);

// System.out.print(hash_Set);
// }