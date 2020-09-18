package test4;

import java.math.BigDecimal;

public class UseCompute {
	public void useCom(Compute com,int one,int two) {
		com.compute(one,two);
	}
	
	
	public String useCom2(Compute com,BigDecimal one,BigDecimal two) {
		return com.compute2(one,two);
	}
}
