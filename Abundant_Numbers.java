import java.util.Scanner;
class Abn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,i;
        int n=sc.nextInt();
        for(i=1;i<=(int)Math.sqrt(n);i++)
      {
        if(n%i==0)
        {
            if(n/i==i)
            sum=sum+i;
            {
                sum=sum+i;
                sum=sum+(n/i);
            }
        }
    }
    sum=sum-n;
    if(sum>n)
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
    }
}