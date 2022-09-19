import java.util.Scanner;
class Winner
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        if(m%2==0 || n%2==0)
    {
        System.out.println("Player 1");
    }
    else
    {
        System.out.println("Player 2");
    }
    }
}