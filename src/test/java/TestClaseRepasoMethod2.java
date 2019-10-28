import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class TestClaseRepasoMethod2 {
	RepasoClass repasoClass= new RepasoClass();
	@Test
	public void test_Exception() throws Exception {
		int [] param= {1,2,3,4,5,7,8};
		Exception ex= assertThrows(Exception.class,()->repasoClass.method2(param));
		assertEquals(null,ex.getMessage());
	}
	@Test
	public void test_ok() throws Exception {
		int [] param= {1,2,3,4,5};
		int resultado=5;
		assertEquals(resultado, repasoClass.method2(param));
	}
	@Test
	public void test_ok2() throws Exception {
		int [] param= {1,5,3,6,7};
		int resultado=7;
		assertEquals(resultado, repasoClass.method2(param));
	}
}
