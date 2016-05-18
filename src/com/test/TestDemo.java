package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {

	@Test
	public void firstTestMethod() {
		System.out.println("First Test Method...........");
		Assert.assertFalse(false);
	}

	@Test
	public void SecondTestMethod() {
		System.out.println("Second Test Method........");
		Assert.assertFalse(false);
	}
}
