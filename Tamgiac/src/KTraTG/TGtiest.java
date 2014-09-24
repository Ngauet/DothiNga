package KTraTG;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TGtiest {

	@Test
	public void tamgiac() {
		Tamgiac Q= new Tamgiac();
		Assert.assertEquals("Scalene",Q.Tamgiac(3,4,5));
	}
	public void can() {
		Tamgiac Q= new Tamgiac();
		Assert.assertEquals("Isosceles",Q.Tamgiac(4,3,3));
	}
	public void not() {
		Tamgiac Q= new Tamgiac();
		Assert.assertEquals("NotATriangle",Q.Tamgiac(4,2,2));
	}
}
