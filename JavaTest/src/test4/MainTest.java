package test4;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UseCompute useCompute = new UseCompute();
		String n = "-1";
		String m = "-2";
		boolean flag = false;
		while(true) {
			System.out.println("�������һ������");
			n = scanner.nextLine();
			if (n != null && n.matches("^[0-9]+\\.?[0-9]+$")) {
				while(true) {
					System.out.println("������ڶ�������");
					m = scanner.nextLine();
					if (m != null && m.matches("^[0-9]+\\.?[0-9]+$")) {
						flag = true;
						break;
					}else {
						System.out.println("����Ƿ������������֣�");
					}
				}
			}else {
				System.out.println("����Ƿ������������֣�");
			}
			if(flag) {
				break;
			}
			
		}
		while(true) {
			System.out.println("��ѡ�����Ĳ�����+,-,*,/����");
			String select = scanner.next();
			if("+".equals(select)) {
				String res = useCompute.useCom2(new AddComputer(), new BigDecimal(n),new BigDecimal(m));
				System.out.println("���Ϊ�� "+res);
				break;
			}else if("-".equals(select)) {
//					useCompute.useCom(new SubComputer(), Integer.parseInt(n), Integer.parseInt(m));
				String res = useCompute.useCom2(new SubComputer(), new BigDecimal(n),new BigDecimal(m));
				System.out.println("���Ϊ�� "+res);
				break;
			}else if("*".equals(select)) {
				useCompute.useCom2(new MultiComputer(), new BigDecimal(n),new BigDecimal(m));
				break;
			}else if("/".equals(select)) {
				String res = useCompute.useCom2(new DivComputer(), new BigDecimal(n),new BigDecimal(m));
				System.out.println("���Ϊ�� "+res);
				break;
			}else {
				System.out.println("������+,-,*,/�е�һ����");
			}
		}
	}
}
