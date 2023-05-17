package Testng;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {
	@DataProvider(name="data-Provider")
	public Object[][] dpmethod(){
		return new Object[][] {{2,3,5},{4,5,7}};
	}
		@Test(dataProvider="data-Provider")
		public void method(int a ,int b ,int result) {
			int sum = a+b;
			Assert.assertEquals(result, sum);
		}
}
