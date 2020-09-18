package homework4;

import java.util.TreeSet;

public class MainTest2 {
	public static void main(String[] args) {
		TreeSet<Student> tree = new TreeSet<Student>();
		tree.add(new Student("张三", 80.5f));
		tree.add(new Student("李四", 90.5f));
		tree.add(new Student("王五", 70.5f));
		tree.add(new Student("赵子龙", 85.5f));
		tree.add(new Student("张飞", 86.5f));
		tree.add(new Student("关羽", 65.5f));
		
		tree.forEach(student->{
			System.out.println(student);
		});
	}
}
