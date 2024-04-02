package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testCreatesNDv128() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(12, 31, 12);
	    String string0 = nDv12_0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv129() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(12, 31, 12);
	    String string0 = nDv12_0.run(12, 31, 1805);
	    assertEquals("1/1/1806", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv126() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(2, 30, 30);
	    String string0 = nDv12_0.run(4, 30, 1822);
	    assertEquals("5/1/1822", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv127() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(12, 31, 12);
	    String string0 = nDv12_0.run(12, 12, 1843);
	    assertEquals("12/13/1843", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv124() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(3, 31, 3);
	    String string0 = nDv12_0.run(3, 31, 1808);
	    assertEquals("4/1/1808", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv125() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(6, 6, 6);
	    String string0 = nDv12_0.run(6, 6, 1822);
	    assertEquals("6/7/1822", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(2, 29, 2);
	    String string0 = nDv12_0.run(2, 29, 1831);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv122() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(12, 31, 12);
	    String string0 = nDv12_0.run(12, 1955, 1955);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1215() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(5, 5, 5);
	    String string0 = nDv12_0.run(5, 5, 1841);
	    assertEquals("5/6/1841", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv123() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(8, 8, 8);
	    String string0 = nDv12_0.run(8, 8, 1821);
	    assertEquals("8/9/1821", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1216() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(10, 10, 10);
	    String string0 = nDv12_0.run(10, 10, 1822);
	    assertEquals("10/11/1822", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv120() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(2, 2, 2);
	    String string0 = nDv12_0.run(2, 30, 30);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1217() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(9, 9, 30);
	    String string0 = nDv12_0.run(9, 30, 1806);
	    assertEquals("10/1/1806", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv121() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(11, 27, 27);
	    String string0 = nDv12_0.run(1, 474, 2436);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1218() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(31, 31, 31);
	    String string0 = nDv12_0.run(11, 31, 1808);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive1() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(2, 2, 2);
	    String string0 = nDv12_0.run((-284), 29, 2);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive0() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(2, 31, 31);
	    String string0 = nDv12_0.run(2, (-190), 20);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(12, 31, 12);
	    String string0 = nDv12_0.run(2474, 2474, 1986);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1210() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(7, 7, 7);
	    String string0 = nDv12_0.run(7, 7, 1851);
	    assertEquals("7/7/1851", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1211() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(2, 5, 5);
	    String string0 = nDv12_0.run(2, 5, 1826);
	    assertEquals("2/6/1826", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1212() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(2, 28, 28);
	    String string0 = nDv12_0.run(2, 28, 1814);
	    assertEquals("3/1/1814", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1213() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(2, 31, 31);
	    String string0 = nDv12_0.run(2, 31, 1814);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1214() throws Throwable {
	    NDv2 nDv12_0 = new NDv2(2, 30, 30);
	    String string0 = nDv12_0.run(1, 1, 1814);
	    assertEquals("1/2/1814", string0);
	}

}