package TestBranch;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import P1.Main;

import junit.framework.Assert;
public class TestBranch {
	
	@Test
	public void TestMain() {
		Assert.assertEquals(new Main().str, "Main branch!");
	}
	
}
