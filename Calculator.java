
public class Calculator {
public void add()
{int n1,n2,n3,n4;
n1=1;n2=2;n3=3;
n4=n1+n2+n3;
System.out.println("addition = "+n4);
}
public void sub()
{
	int n5,n6;
	n5=10;n6=6;int n7=n5-n6;
	System.out.println("subtraction = " +n7);
}
public void div()
{
	float d1,d2,d3;
	d1=10.5f;d2=2.2f;d3=d1/d2;
	System.out.println("division = " +d3);
}
public void mul()
{
	double m1,m2,m;
	m1=1234d;m2=9810d;m=m1*m2;
	System.out.println("multiplication = "+m);
}
	public static void main(String[] args)
	{
		Calculator fn=new Calculator();
		fn.add();fn.sub();fn.div();fn.mul();

}
}
