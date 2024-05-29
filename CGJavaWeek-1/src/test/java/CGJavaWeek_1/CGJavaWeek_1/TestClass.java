package CGJavaWeek_1.CGJavaWeek_1;

import junit.framework.Assert;

public class TestClass {

	public static void main(String[] args) {
		
		AddNumbers num= new AddNumbers();
		int actual=10;
		int expected= num.addNumbers(5, 5);
		
		Assert.assertEquals(actual, expected);
	}

}
