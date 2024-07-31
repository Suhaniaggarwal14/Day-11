package com.graymatter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {
	@Test
	public void testSayHello() {
		String expected="hello....!";
		HelloClass hc=new HelloClass();
		String actual=hc.sayHello();
		assertEquals(expected,actual);
	}

}
