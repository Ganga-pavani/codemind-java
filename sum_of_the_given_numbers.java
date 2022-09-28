import java.util.Scanner;
class Root
{
    public static void main(String args[])
    {
        int t,c,a,b;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
while(t>0)
{
    a=sc.nextInt();
    b=sc.nextInt();
    c=a+b;
    System.out.println(c);
    //System.out.println("");
    t--;
}
    }
}