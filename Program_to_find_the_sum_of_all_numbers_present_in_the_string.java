import java.util.Scanner;
import java.lang.*;
class words
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int x=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                x+=s.charAt(i)-'0';
            }
        }
        System.out.print(x);
    }
}