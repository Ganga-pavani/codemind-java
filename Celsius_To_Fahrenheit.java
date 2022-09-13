import java.util.Scanner;
class Ascii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float ce=sc.nextFloat();
        float fa;
        fa=(9*ce/5)+32;
        System.out.format("%.2f",fa);
        sc.close();
    }
}