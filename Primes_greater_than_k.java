import java.util.Scanner;
class prime
{
    public static boolean prime(int n)
    {
        if(n==1 || n==0)
        {
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        int c=0;
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int j=0;j<n;j++)
        {
          if(prime(arr[j]))
            {
                if(arr[j]>=k)
                {
                    c+=1;
                }
            }
        }
        System.out.println(c);
    }
}