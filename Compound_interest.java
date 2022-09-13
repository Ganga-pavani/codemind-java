import java.util.Scanner;
class CompoundInterest 
{
   public static void main (String args[])
   {
      double p,r,t,ci;
      Scanner sc =new Scanner(System.in);
      p=sc.nextDouble();
      r=sc.nextDouble();
      t=sc.nextDouble();
      ci=p*(Math.pow((1 + r / 100), t));
      System.out.format("%.2f",ci);
   }
}