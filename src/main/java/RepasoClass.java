public class RepasoClass {

	public RepasoClass() {
		// TODO Auto-generated constructor stub
	}
	public boolean method1(String param1,String param2) throws Exception {
		if(param1.equals("exception") || param2.equals("exception"))
			throw new Exception();
		if(param1.equals(param2))
			return true;
		return false;
	}
	public int method2(int [] param)throws Exception {
		if(param.length>5) {
			throw new Exception();
		}
		int resultado=param[0];
		int valor;
		for(int i=0;i<param.length;i++) {
			valor=param[i];
			if(resultado<=valor) {
				resultado=valor;
			}
		}
		return resultado;
	}
<<<<<<< HEAD
	public boolean method5(String param1, String param2) throws Exception{
		if(param1==null || param2==null) {
			throw new Exception();
		}
=======
	public boolean method5(String param1, String param2) {
>>>>>>> parent of e7d0eb2... codigo_E_bien
		return param1.equals(param2);
	}
	public class ConvertInt {
		public int convert(char[] str) throws Exception{
			if (str.length > 6) 
				throw new Exception(); 
			int number=0;int digit; int i=0;
			if (str[0]=='-') 
				i=1;
			for(; i<str.length; i++){
				digit = str[i] - '\0';
				number = number * 10 + digit;
			}     	
			if (str[0]=='-') 
				number =  -number;
			if (number > 32767 || number < -32768) 
				throw new Exception();
			return number;
		}
	}
}
