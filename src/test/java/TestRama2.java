import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestRama2 {
	RepasoClass repasoClass=new RepasoClass();
	@Test
	public void test_ok() {
		String param1="hola";
		String param2="hola";
		assertEquals(true,repasoClass.method5(param1, param2));
	}
	@Test
	public void test_ok2() {
		String param1="hola";
		String param2="holaaa";
		assertEquals(false,repasoClass.method5(param1, param2));
	}
}
