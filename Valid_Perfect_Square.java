import java.util.Scanner;
class Perfect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int c=0;
            int n=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                if(n==i*i)
                {
                    c++;
                }
            }
                if(c==1)
                {
                    System.out.println("True");
                }
                else
                {
                    System.out.println("False");
                }
            t--;
        }
        sc.close();
    }
}