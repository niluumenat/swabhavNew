package com.techlabs.inheritance;

public class TestClass {
	public static void main(String[] args){
		A a=new A();
		B b=new B();
		C c=new C();
		A a2=new C();
		B b1=new C();
		/*b.m1();
		c.m2();
		a.m3();
		c.m1();
		c.m2();
		c.m3();
		a.m1();
		b.m2();
		c.m3();
		b1.m1();
		b1.m2();
		b1.m3();*/
		a2.m1();
		a2.m2();
		a2.m3();

	}

}
