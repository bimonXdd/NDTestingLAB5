package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

	@Test(timeout = 4000)
	public void testCreatesNDv1215() throws Throwable {
	    NDv21 nDv12_0 = new NDv21(1, 1813, 1);
	    String string0 = nDv12_0.run(1, 1, 1813);
	    assertEquals("1/2/1813", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1216() throws Throwable {
	    NDv21 nDv12_0 = new NDv21(1825, 1825, 3);
	    String string0 = nDv12_0.run(3, 3, 1825);
	    assertEquals("3/4/1825", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1217() throws Throwable {
	    NDv21 nDv12_0 = new NDv21((-12), 1821, (-12));
	    String string0 = nDv12_0.run(10, 10, 1821);
	    assertEquals("10/11/1821", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1218() throws Throwable {
	    NDv21 nDv12_0 = new NDv21(1352, 1817, 1352);
	    String string0 = nDv12_0.run(9, 30, 1817);
	    assertEquals("10/1/1817", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithZero() throws Throwable {
	    NDv21 nDv12_0 = new NDv21(0, 0, 0);
	    String string0 = nDv12_0.run(0, 10, 10);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv128() throws Throwable {
	    NDv21 nDv12_0 = new NDv21((-745), (-745), (-745));
	    String string0 = nDv12_0.run(12, 31, 2009);
	    assertEquals("1/1/2010", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv129() throws Throwable {
	    NDv21 nDv12_0 = new NDv21(1825, 1825, 7);
	    String string0 = nDv12_0.run(7, 7, 1825);
	    assertEquals("7/7/1825", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv126() throws Throwable {
	    NDv21 nDv12_0 = new NDv21((-745), (-745), 21);
	    String string0 = nDv12_0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv127() throws Throwable {
	    NDv21 nDv12_0 = new NDv21(1801, 1801, (-773));
	    String string0 = nDv12_0.run(12, 12, 1801);
	    assertEquals("12/13/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv124() throws Throwable {
	    NDv21 nDv12_0 = new NDv21(1825, 1825, (-1));
	    String string0 = nDv12_0.run(11, 30, 1825);
	    assertEquals("12/1/1825", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv125() throws Throwable {
	    NDv21 nDv12_0 = new NDv21((-18), (-18), (-18));
	    String string0 = nDv12_0.run(4, 31, 1924);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NDv21 nDv12_0 = new NDv21(1, 1816, 1);
	    String string0 = nDv12_0.run(2, 28, 1816);
	    assertEquals("2/29/1816", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv122() throws Throwable {
	    NDv21 nDv12_0 = new NDv21(1825, 1825, 8);
	    String string0 = nDv12_0.run(8, 8, 1825);
	    assertEquals("8/9/1825", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv123() throws Throwable {
	    NDv21 nDv12_0 = new NDv21((-758), 1801, 1801);
	    String string0 = nDv12_0.run(6, 29, 1801);
	    assertEquals("6/30/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv120() throws Throwable {
	    NDv21 nDv12_0 = new NDv21(1825, 1825, 3);
	    String string0 = nDv12_0.run(3, 1825, 1825);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv121() throws Throwable {
	    NDv21 nDv12_0 = new NDv21((-745), 1174, 51);
	    String string0 = nDv12_0.run(5, 31, 2000);
	    assertEquals("6/1/2000", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndNegative() throws Throwable {
	    NDv21 nDv12_0 = new NDv21((-18), (-18), (-18));
	    String string0 = nDv12_0.run((-1), (-1), 31);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive1() throws Throwable {
	    NDv21 nDv12_0 = new NDv21(5, 5, 5);
	    String string0 = nDv12_0.run(5, 5, 5);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive0() throws Throwable {
	    NDv21 nDv12_0 = new NDv21(1839, 1839, 1839);
	    String string0 = nDv12_0.run(1839, 1839, 1839);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive2() throws Throwable {
	    NDv21 nDv12_0 = new NDv21((-745), (-745), 21);
	    String string0 = nDv12_0.run(11, 2010, 2624);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1210() throws Throwable {
	    NDv21 nDv12_0 = new NDv21((-749), 1801, 1801);
	    String string0 = nDv12_0.run(2, 2, 1801);
	    assertEquals("2/3/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1211() throws Throwable {
	    NDv21 nDv12_0 = new NDv21((-782), 1816, 1816);
	    String string0 = nDv12_0.run(2, 29, 1816);
	    assertEquals("3/1/1816", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1212() throws Throwable {
	    NDv21 nDv12_0 = new NDv21(1, 1821, 1);
	    String string0 = nDv12_0.run(2, 28, 1821);
	    assertEquals("3/1/1821", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1213() throws Throwable {
	    NDv21 nDv12_0 = new NDv21((-785), 1818, (-785));
	    String string0 = nDv12_0.run(2, 30, 1818);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNDv1214() throws Throwable {
	    NDv21 nDv12_0 = new NDv21((-749), 1801, 1801);
	    String string0 = nDv12_0.run(2, 29, 1801);
	    assertEquals("Invalid Input Date", string0);
	}

}