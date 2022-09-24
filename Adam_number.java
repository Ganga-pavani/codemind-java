import java.util.Scanner;
class Happy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,sum=0,temp,a,b,c=0;
    int n=sc.nextInt();
    temp=n*n;
    while(n>0)
    {
        r=n%10;
        sum=sum*10+r;
        n=n/10;
        
    }
    a=sum*sum;
    while(a>0)
    {
        b=a%10;
        c=c*10+b;
        a=a/10;
    }
    if(temp==c)
    System.out.println("True");
    else
    System.out.println("False");
    }
}