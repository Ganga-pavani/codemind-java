import java.util.Scanner;
class Ascii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=sc.nextInt();
        int b=sc.nextInt();
        int cap;
        int z=1024;
        int res;
        cap=2*t*s*b*512;
        res=cap/z;
        System.out.print(res);
        System.out.print("KB");
        sc.close();
    }
}