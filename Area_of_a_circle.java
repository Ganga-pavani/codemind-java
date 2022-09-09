import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        int a;
        double b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=3.14*a*a;
        System.out.format("%.2f",b);
        sc.close();
        
    }
    
}