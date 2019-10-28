import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class TestRama2 {
	RepasoClass repasoClass=new RepasoClass();
	@Test
	public void test_ok() throws Exception {
		String param1="hola";
		String param2="hola";
		assertEquals(true,repasoClass.method5(param1, param2));
	}
	@Test
	public void test_ok2() throws Exception {
		String param1="hola";
		String param2="holaaa";
		assertEquals(false,repasoClass.method5(param1, param2));
	}
	@Test
	public void test_Exception1() throws Exception {
		String param1="null";
		Exception excepcion=assertThrows(Exception.class, ()->repasoClass.method5(param1, null));
		assertEquals(null, excepcion.getMessage());
	}
	@Test
	public void test_Exception2() throws Exception {
		String param2="null";
		Exception excepcion=assertThrows(Exception.class, ()->repasoClass.method5(null,param2));
		assertEquals(null, excepcion.getMessage());
	}
}
