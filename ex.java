class ex
{
public static void main(String args[])
{
try
{
int a=args.length;
System.out.println("a="+a);
int b=42/a;
int c[]={1};
c[5]=10;
}
catch(ArithmeticException e)
{
e.printStackTrace();
}
System.out.println("after try catch");
}
}