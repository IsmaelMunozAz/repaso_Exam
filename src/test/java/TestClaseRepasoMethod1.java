import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class TestClaseRepasoMethod1 {
	RepasoClass repasoClass=new RepasoClass();
	@Test
	public void test_failException1() {
		String param1="exception";
		Exception ex=assertThrows(Exception.class,()-> repasoClass.method1(param1, "hola"));
		assertEquals(null, ex.getMessage());
	}
	@Test
	public void test_failException2() {
		String param2="exception";
		Exception ex=assertThrows(Exception.class,()-> repasoClass.method1("hola",param2));
		assertEquals(null, ex.getMessage());
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
