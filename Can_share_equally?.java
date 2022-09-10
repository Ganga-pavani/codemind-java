import java.util.Scanner;
class Alpha
{
    public static void main(String args[])
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        int z=x+2*y;
        if(x==0&&y%2==0)
        {
            System.out.println("YES");
        }
        else if(x==0&&y%2!=0)
        {
            System.out.println("NO");
        }
        else if(z%2==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
        sc.close();
    }
}