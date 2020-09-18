package test4;

import java.math.BigDecimal;

public class DivComputer implements Compute{

	@Override
	public int compute(int n, int m) {
		if(m == 0) {
			System.out.println("��������Ϊ0");
			return -Integer.MAX_VALUE;
		}
		int res = n / m;
		System.out.println("n / m��ֵΪ��"+res);
		return res;
	}

	@Override
	public String compute2(BigDecimal n, BigDecimal m) {
		return n.divide(m,3,BigDecimal.ROUND_HALF_EVEN).toString();
	}

}
