	package com.siva.junitDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringTest {

	@Test
	public void test() {
//		fail("Not yet implemented");
	}
	
	@Test
	public void testAssertEquals() {
		assertEquals(2, 2); // Checks the expected output with the applications output
		int expectedOutput = 3 , actualOutput = Math.min(5, 3);
		
		assertEquals(expectedOutput, actualOutput);
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Executed Before every test");
	}
	
	@After
	public void afterTest() {
		System.out.println("Executed After every test");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Executed before every class execution");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Executed after every class execution");
	}
}
