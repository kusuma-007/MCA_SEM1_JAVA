class AThread implements Runnable
{
public void run()
{
for(int i=20;i<=30;i++)
{
System.out.println("i="+i);
}
}
}
class BThread implements Runnable
{
public void run()
{
for(int j=31;j<=40;j++)
{
System.out.println("j="+j);
}
}
}
class CThread implements Runnable
{
public void run()
{
for(int k=41;k<=50;k++)
{
System.out.println("k="+k);
}
}
}
public class ThreadRunnable
{
public static void main(String args[])
{
AThread ta = new AThread();
Thread t1 = new Thread(ta);
t1.start();
BThread tb = new BThread();
Thread t2 = new Thread(tb);
t2.start();
CThread tc = new CThread();
Thread t3 = new Thread(tc);
t3.start();
}
}