import java.util.Scanner;
class Happy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x==0)
    {
        System.out.println(y);
    }
    else if(y==0)
    {
        System.out.println(x);
    }
    else if(x==y)
    {
        System.out.println(x);
    }
    else
    {
        while(x!=y)
        {
            if(x>y)
            x=x-y;
            else if(y>x)
            y=y-x;
        }
    }
    System.out.println(x);
    }
}