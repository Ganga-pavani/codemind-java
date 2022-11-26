import java.util.Scanner;
class wave
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n-2;i+=2)
        {
            if(a[i+1]>a[i] && a[i+1]>a[i+2])
            {
                c=c+1;
            }
            else if(a[i]>a[i+1] && a[i+1]<a[i+2])
            {
                c=c+1;
            }
            else
            {
                c=0;
                break;
            }
        }
        if(c==0)
        {
            System.out.print("no");
        }
        else
        {
            System.out.print("yes");
        }
    }
}