package homework4;

import java.util.TreeSet;

public class MainTest2 {
	public static void main(String[] args) {
		TreeSet<Student> tree = new TreeSet<Student>();
		tree.add(new Student("����", 80.5f));
		tree.add(new Student("����", 90.5f));
		tree.add(new Student("����", 70.5f));
		tree.add(new Student("������", 85.5f));
		tree.add(new Student("�ŷ�", 86.5f));
		tree.add(new Student("����", 65.5f));
		
		tree.forEach(student->{
			System.out.println(student);
		});
	}
}
