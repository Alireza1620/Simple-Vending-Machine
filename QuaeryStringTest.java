import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class QuaeryStringTest {

	QueryString qs = new QueryString("name=Alice&age=19&country=UK");
	QueryString qr = new QueryString("");
	@Test 
	public void testGetParameter() {
		assertEquals("Alice", qs.getParameter("name"));
		assertEquals("19", qs.getParameter("age"));
		assertEquals("UK", qs.getParameter("country"));
		assertEquals(null, qs.getParameter("occupation"));
		assertEquals(null, qr.getParameter("name"));
	}
	@Test 
	public void testHasParameter() {
		assertTrue(qs.hasParameter("name"));
		assertTrue(qs.hasParameter("age"));
		assertTrue(qs.hasParameter("country"));
		assertFalse(qs.hasParameter("occupation"));
		assertFalse(qs.hasParameter("count"));
		assertFalse(qr.hasParameter("name"));
	}
	@Test 
	public void testHasParamGetParameterOffset() {
		assertEquals(11, qs.getParameterOffset("age"));
		assertEquals(-1, qs.getParameterOffset("occupation"));
	}
	@Test
	public void testDeCode() {
		assertEquals("Hello, world!", qs.decode("Hello%2C+world%21"));
		assertEquals("Alice", qs.decode("Alice"));
	}
}
