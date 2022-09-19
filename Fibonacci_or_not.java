import java.util.Scanner;
class Fibbo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,n2,n3,i,c=0;
        n=sc.nextInt();
        n1=0;
        n2=1;
        for(i=0;i<n;i++)
      {
        n3=n1+n2;
        n1=n2;
        n2=n3;
        if(n==n3)
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

}
    }