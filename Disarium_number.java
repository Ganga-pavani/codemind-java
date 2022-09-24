import java.util.Scanner;
class Dis
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,c=0;
        while(temp!=0)
        {
           temp=temp/10;
           c++;
        }
    temp=n;
    int sum=0;
    while(temp!=0)
    {
        int r=temp%10;
        sum=sum+(int)Math.pow(r,c);
        temp=temp/10;
        c--;
    }
    if(n==sum)
   {
       System.out.println("True");
   }
    else
    {
        System.out.println("False");
    }
    }
}