package com.aditya.csejenkins1;

public class cseAddtest {
	class cseaddtest{
    cseAdd c=new cseAdd();
	     @Test
		void csetest() {
			int result=c.add(2,3);
			assertEqual(5,result);
		}
		@Test
		void csetest1() {
			int result=c.mul(2,3);
			assertEqual(6,result);
	}

}
