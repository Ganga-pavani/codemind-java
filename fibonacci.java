import java.util.Scanner;
class Fibbo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a,b,c,i;
        n=sc.nextInt();
        a=0;b=1;
        for(i=1;i<=n;i++)
      {
        System.out.print(a+" ");
        c=a+b;
        a=b;
        b=c;
     }
    }
}