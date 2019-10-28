import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestClaseRepasoMethod1 {
	RepasoClass repasoClass=new RepasoClass();
	@Test
	public void test_failException1() throws Exception {
		String param1="false";
		assertEquals(false, repasoClass.method1(param1,"hola"));

	}
	@Test
	public void test_failException2() throws Exception {
		String param2="false";
		assertEquals(false, repasoClass.method1("adios",param2));
	}
	
	@Test
	public void test_ok()throws Exception {
		String param1="hola";
		String param2="hola";
		assertEquals(true, repasoClass.method1(param1, param2));
	}
	@Test 
	public void test_fail() throws Exception{
		String param1="hola";
		String param2="adios";
		assertEquals(false, repasoClass.method1(param1, param2));
	}
	
}
