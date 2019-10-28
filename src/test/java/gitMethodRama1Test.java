import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class gitMethodRama1Test {

	RepasoClass repasoClass=new RepasoClass();
	@Test
	public void test_Exception() {
		String param="exception";
		int valor=5;
		Exception ex=assertThrows(Exception.class, ()->repasoClass.method4(param, valor));
		assertEquals(null,ex.getMessage());	
	}
	@Test
	public void test_ok() throws Exception {
		String param="valor";
		int valor=5;
		int result=90;
		assertEquals(result,repasoClass.method4(param, valor));
	}
	@Test
	public void test_ok2() throws Exception {
		String param="valor2";
		int valor=5;
		int result=10;
		assertEquals(result,repasoClass.method4(param, valor));
	}
}
