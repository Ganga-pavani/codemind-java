import java.util.Scanner;
class Perfect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            int r=n%i;
            if(r==0)
            {
                sum=sum+i;
            }
        }
        if(sum==n)
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