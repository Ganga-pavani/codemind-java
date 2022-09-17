import java.util.Scanner;
class Perfect
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n;
        int d,i,fact=1,res=0;
        while(n1>0)
        {
           fact=1;
           d=n1%10;
           for(i=1;i<=d;i++)
           {
               fact=fact*i;
           }
           res=res+fact;
           n1=n1/10;
        }
        if(res==n)
        {
            System.out.println("The number "+n+" is a strong number");
        }
        else
        {
            System.out.println("The number "+n+" is not a strong number");
        }
        
        
        sc.close();
    }
}