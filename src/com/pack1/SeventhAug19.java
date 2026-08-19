package com.pack1;

public class SeventhAug19 extends SixthAug19
{
	void meth2()
	{
		System.out.println("SeventhAug19 Meth2() Called");
		super.meth1();
	}
	SeventhAug19()
	{
		System.out.println("SeventhAug19 default cons");
		this.meth2();
	}
	SeventhAug19(int x)
	{
		super(500);
		super.meth1();
		this.meth2();
		new SeventhAug19().meth1();
		System.out.println("SeventhAug19 para cons: "+x);
	}
	public static void main(String[] args) {
		SeventhAug19 obj=new SeventhAug19();
		obj.meth2();
	}

}
