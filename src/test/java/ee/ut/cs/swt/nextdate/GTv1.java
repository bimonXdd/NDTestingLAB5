package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv1 {

	@Test(timeout = 4000)
	public void testCreatesNDv117() throws Throwable {
		NDv12 nDv12_0 = new NDv12(11, 11, 11);
	    String string0 = nDv12_0.run(11, 31, 1996);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv115() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(10, 1821, 10);
	    String string0 = nDv12_0.run(10, 10, 1821);
	    assertEquals("10/11/1821", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv116() throws Throwable {
	    NDv12 nDv12_0 = new NDv12((-7), (-7), (-7));
	    String string0 = nDv12_0.run(4, 4, 2021);
	    assertEquals("4/5/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv113() throws Throwable {
	    NDv12 nDv12_0 = new NDv12((-278), (-278), (-278));
	    String string0 = nDv12_0.run(5, 5, 2008);
	    assertEquals("5/6/2008", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv114() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(8, 1807, 8);
	    String string0 = nDv12_0.run(8, 16, 1807);
	    assertEquals("8/17/1807", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(2, 1805, 2);
	    String string0 = nDv12_0.run(2, 30, 1805);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv111() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(2, 1954, 2);
	    String string0 = nDv12_0.run(2, 29, 1954);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv112() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(3, 1809, 3);
	    String string0 = nDv12_0.run(3, 3, 1809);
	    assertEquals("3/4/1809", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv110() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(2, 1862, 2);
	    String string0 = nDv12_0.run(2, 28, 1862);
	    assertEquals("3/1/1862", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive1() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(320, 37, 37);
	    String string0 = nDv12_0.run((-508), 17, 37);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv18() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(7, 1807, 7);
	    String string0 = nDv12_0.run(7, 7, 1807);
	    assertEquals("7/7/1807", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive0() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(11, 11, 11);
	    String string0 = nDv12_0.run(2, (-1), 1996);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv19() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(2, 1809, 2);
	    String string0 = nDv12_0.run(2, 2, 1809);
	    assertEquals("2/3/1809", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv16() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(9, 1807, 9);
	    String string0 = nDv12_0.run(9, 30, 1807);
	    assertEquals("10/1/1807", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv17() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(12, 1807, 12);
	    String string0 = nDv12_0.run(12, 12, 1807);
	    assertEquals("12/13/1807", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv14() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(1839, 1839, 1839);
	    String string0 = nDv12_0.run(1, 1, 1839);
	    assertEquals("1/2/1839", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(320, 37, 37);
	    String string0 = nDv12_0.run(37, 2021, 37);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv15() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(6, 1803, 6);
	    String string0 = nDv12_0.run(6, 6, 1803);
	    assertEquals("6/7/1803", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv12() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(12, 1807, 12);
	    String string0 = nDv12_0.run(12, 1807, 1807);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv13() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(1, 1802, 1);
	    String string0 = nDv12_0.run(1, 31, 1802);
	    assertEquals("2/1/1802", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv10() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(320, 37, 37);
	    String string0 = nDv12_0.run(8, 30, 30);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv11() throws Throwable {
	    NDv12 nDv12_0 = new NDv12(8, (-3046), (-6034));
	    String string0 = nDv12_0.run(1, 30, 2022);
	    assertEquals("invalid Input Date", string0);
	}

}