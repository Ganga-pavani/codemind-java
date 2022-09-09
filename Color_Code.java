import java.util.Scanner;
class season
{
    public static void main(String args[])
    {
        char c;
        Scanner sc=new Scanner(System.in);
        c=sc.nextLine().charAt(0);
        if(c=='v'||c=='V')
        {
            System.out.println("Violet");
        }
        else if(c=='i'||c=='I')
        {
            System.out.println("Indigo");
        }
        else if(c=='b'||c=='B')
        {
            System.out.println("Blue");
        }
        else if(c=='g'||c=='G')
        {
            System.out.println("Green");
        }
        else if(c=='y'||c=='Y')
        {
            System.out.println("Yellow");
        }
        else if(c=='o'||c=='O')
        {
            System.out.println("Orange");
        }
        else if(c=='r'||c=='R')
        {
            System.out.println("Red");
        }
        else
        {
            System.out.println("-1");
        }
        sc.close();
    }
}