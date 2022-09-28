import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        int n,c=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            c=0;
            if(n%i==0)
            {
                c=1;
            }
        }
        if(c==0)
        {
            System.out.print("prime");
        }
        else
        {
            System.out.print("not a prime");
        }
    }
}