package TestBranch;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


import P1.BranchB;

import P1.BranchA;
import P1.Main;

import junit.framework.Assert;
public class TestBranch {
	
	@Test
	public void TestMain() {
		Assert.assertEquals(new Main().str, "Main branch!");
	}
	
	@Test
	public void TestBranchB() {
		Assert.assertEquals(new BranchB().str, "Branch B!");
	}
	@Test
	public void TestBranchA() {
		Assert.assertEquals(new BranchA().str, "Branch A!");

	}
	
}
