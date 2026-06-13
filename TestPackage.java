Add.java:
package mypack;
public class Add
{
int a,b;
public int sum(int p, int q)
{
a=p;
b=q;
return a+b;
}
}

Multiplication.java
package mypack;
public class Multiplication
{
int a,b;
public int mul(int p, int q)
{
a=p;
b=q;
return a*b;
}
}


Sub.java:
package mypackage;
public class Sub
{
int a,b;
public int sub(int p, int q)
{
a=p;
b=q;
return a-b;
}
}

TestPackage.java:
import mypack.Add;
import mypack.Multiplication;
import mypackage.Sub;
public class TestPackage
{
public static void main(String args[])
{
Add o1=new Add();
int r=o1.sum(10,30);
System.out.println("Sum="+r);
Multiplication o2=new Multiplication();
int s=o2.mul(10,30);
System.out.println("Mul="+s);
Sub o3=new Sub();
int q=o3.sub(50,30);
System.out.println("Sub="+q);    } }
Output:
