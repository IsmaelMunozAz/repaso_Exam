import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class RepasoClassMethod3Test {

	RepasoClass repasoClass=new RepasoClass();
	RepasoClass.ConvertInt convertInt= repasoClass.new ConvertInt();
	
	//Caso 1 str.length>6
	@Test()
	public void test_caso1_Convert() throws Exception{
		char[] str= {'a','b','c','d','e','f','g','h'};
		Exception excepcion=assertThrows(Exception.class, ()->convertInt.convert(str));
		assertEquals(null, excepcion.getMessage());
		
	}
	//Caso 2 str.length<6 str={- w h t l r }
	@Test()
	public void test_caso2_Convert() throws Exception {
		
		char[] str= {'-','w','h','t','l','r'};
		Exception excepcion=assertThrows(Exception.class, ()->convertInt.convert(str));
		assertEquals(null, excepcion.getMessage());
	}
	
	//Caso 3 str.length<6 str={a w h t l r }
	@Test()
	public void test_caso3_Convert() throws Exception {
		
		char[] str= {'a','w','h','t','l','r'};
		Exception excepcion=assertThrows(Exception.class, ()->convertInt.convert(str));
		assertEquals(null, excepcion.getMessage());
	}
	
	//Caso 4 str.length<6 str={-,b,c}
	@Test()
	public void test_caso4_Convert() throws Exception {	
		char[] str= {'-','-','-','-'};
		int resultado = -4995;
		assertEquals(resultado,convertInt.convert(str));
	}
		
	//Caso 5 str.length<6 str={a,b,c}
	@Test()
	public void test_caso5_Convert() throws Exception {
		char[] str= {'a','b','c'};
		int resultado = 10779;
		assertEquals(resultado,convertInt.convert(str));
	}
}
