import java.util.*;
class Duplicate
{
    public static void main()
    {
        Random rd = new Random();
        int arr[]=new int[10];
        int i;
        int n=10;
        System.out.print("The real array: ");
        for(i=0;i<n;i++)
        {
            arr[i]=rd.nextInt(5);
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<n;i++)

            for(int j=i+1;j<n;j++)

                if(arr[i]==arr[j])
                {
                    for(int k=j+1;k<n;k++)

                        arr[k-1]=arr[k];      
                    n--;
                    j--;
                }
        System.out.println("\nThe origianl array");
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
