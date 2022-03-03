package com.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNgDependsOnAndEnable4 {

	@Test
	public void z() {
		System.out.println("I am Z");
	}

	@Test(enabled = false)
	public void p() {
		System.out.println("I am P");
	}

	@Test(alwaysRun = true)
	public void s() {
		System.out.println("I am S");
	}

	@Test(dependsOnMethods = { "s" })
	public void a() {
		System.out.println("I am A");
	}

	@Test
	public void d() {
		System.out.println("I am calculating 2 numbers");
		throw new  SkipException("Skiping this test from execution");
		//int res = 5 + 5;
		//System.out.println(res);
	}
}
