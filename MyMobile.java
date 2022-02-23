package week1.day2;

public class MyMobile {
static int n=004;
static long mobno=9876543210l;
static boolean islocked=true;
static char letter='G';
static double n0=0.314d;
public void makeCall()
{
	System.out.println("make call");
}
public void sendMsg()
{
	System.out.println("send messag");
	}

public void payBills() {
	System.out.println("pay the bills");}

public static void main(String[]args) {
	
	System.out.println(n);
	System.out.println(mobno);
	System.out.println(islocked);
	System.out.println(letter);
	System.out.println(n0);
	System.out.println("welcome to JAVA");
	MyMobile obj=new MyMobile();
	obj.makeCall();
	obj.sendMsg();
	obj.payBills();
	
	
}
}
