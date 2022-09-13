import java.util.Scanner;
class Ascii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float fa=sc.nextFloat();
        float ce;
        ce=(fa-32)*5/9;
        System.out.format("%.2f",ce);
        sc.close();
    }
}