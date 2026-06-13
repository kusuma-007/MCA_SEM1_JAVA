//1.Write a Java Program to generate Fibonacci sequence for n numbers.//
import java.lang.*;
import java.util.*;
class Fibonaci
{
 public static void main(String[] args)
 {
   int n,a,b,c;
   a=0;
   b=1;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a value");
   n=sc.nextInt();
   System.out.println("Fibonaci series till" + n + "terms");
   for(int i=1;i<=n; i++)
   {
    System.out.println(a);
    c=a+b;
    a=b;
    b=c;
    }
  }
}

