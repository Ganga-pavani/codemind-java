import java.util.Scanner;
class Root
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double d=Math.sqrt(n);
        if((int)d==d)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}