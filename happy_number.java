import java.util.Scanner;
class Happy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d,res=0;
        int n=sc.nextInt();
    while(n>0)
    {
        d=n%10;
        n=n/10;
        res+=d*d;
        if(n==0&&res>9)
        {
            n=res;
            res=0;
        }
    }
    if(res==1)
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
    }
}