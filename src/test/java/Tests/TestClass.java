package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void testOne()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void testTwo()
	{
		Assert.assertFalse(true);
	}
	
	@Test
	public void testThree()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void testFour()
	{
		Assert.assertFalse(false);
	}
}
