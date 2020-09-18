package test4;

import java.math.BigDecimal;

public class AddComputer implements Compute{

	@Override
	public int compute(int n, int m) {
		int res = n+m;
		System.out.println("n + mµÄÖµÎª£º"+res);
		return res;
	}

	@Override
	public String compute2(BigDecimal n, BigDecimal m) {
		return n.add(m).toString();
	}

}
