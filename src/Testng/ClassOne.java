package Testng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ClassOne {
	@Test 
	public void Test7(){
		System.out.println("Test7");
		}
	@Test
	public void Test8(){
		System.out.println("Test8");
		Assert.assertTrue(false);
		}
	@Test
	public void Test9(){
		System.out.println("Test9");
		throw new SkipException("Skipped");
		}}

