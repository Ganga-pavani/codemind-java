import java.util.Scanner;
class min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int c=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>c)
            {
               c=arr[i];
            }
        }
        System.out.print(c);
    }
}