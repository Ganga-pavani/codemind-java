import java.util.Scanner;
class Ascii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        int x=sum/n;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                c++;
            }
        }
        if(c>0)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
        sc.close();
    }
}