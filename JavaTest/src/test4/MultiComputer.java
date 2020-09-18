package test4;

import java.math.BigDecimal;

public class MultiComputer implements Compute{

	@Override
	public int compute(int n, int m) {
		int res = n*m;
		System.out.println("n * mµÄÖµÎª£º"+res);
		return n * m;
	}

	@Override
	public String compute2(BigDecimal n, BigDecimal m) {
		
		return n.multiply(m).toString();
	}

}
