package org.tcs;

public class RbiBank extends WorldBank 
{
@Override
	public void savings() {
	
		super.savings();
	}
{
System.out.println("  Rbi saving is 12%");
}
@Override
	public void loan() {
	
		super.loan();
		System.out.println(" Rbi loan is 10%");
	}
public static void main(String[] args) {
	RbiBank r=new RbiBank();
	r.savings();
	r.loan();
}
}
