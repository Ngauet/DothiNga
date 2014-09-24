package Day;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class NextdayTest {

	@Test
	public void test() {
		Nextday a=new Nextday();
		Assert.assertEquals("(2,2,1994)",a.NextDay(1,2,1994));
	}

}
