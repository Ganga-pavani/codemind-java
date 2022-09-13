import java.util.Scanner;
class Ascii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int b=sc.nextInt();
        int w=sc.nextInt();
        int c=sc.nextInt();
        int area=((i+2*w)*(b+2*w)-i*b);
        System.out.println(area*c);
        sc.close();
    }
}