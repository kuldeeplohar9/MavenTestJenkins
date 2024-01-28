package com.test.testing;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.calc.LibMath;

public class TestCalc {
	@Test
	public void Testadd() {
		LibMath lib = new LibMath();

		int num1 = 10;
		int num2 = 20;
		int actSum = lib.Sum(num1, num2);
		int expSum = 30;
		assertEquals(actSum, expSum);
		System.out.println("sum is 30");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Before");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}

}
