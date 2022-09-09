import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        int a;
        float b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=(float)(32+(a*1.8));
        System.out.format("%.2f",b);
        sc.close();
        
    }
    
}