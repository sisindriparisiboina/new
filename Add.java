class Add
{
public Add()
{
System.out.println(".........");
}
public Add(int i,int j)
{

this(123.34,277);
System.out.println(i+j);
}
public Add(double k,int l)
{
this();
System.out.println(k+l);
}
public static void main(String args[])
{
Add d1=new Add(100,100);
}
}

