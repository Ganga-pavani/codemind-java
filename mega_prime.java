import java.util.Scanner;
class Mega
{
    public static boolean fun(int num)
    {
        int i,fc=0;
    for(i=1;i<=num;i++)
    {
        if(num%i==0)
        {
            fc++;
        }
    }
    if(fc==2)
    {
        return true;
    }
    else
    {
        return false;
    }
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n,d,c=0,cc=0,temp;
    n=sc.nextInt();
    temp=n;
    if(fun(n))
    {
        while(n!=0)
        {
            d=n%10;
            if(fun(d))
            {
                cc++;
            }
            n=n/10;
            c++;
        }
        if(c==cc)
        {
            System.out.println("Mega Prime");
        }
        else
        {
            System.out.println("Not Mega Prime");
        }
    }
        else
        {
           System.out.println("Not Mega Prime");
        }
}
}