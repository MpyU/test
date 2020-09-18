package test11;

import java.util.Comparator;

public class Animal implements Comparator<Animal>{
	private Integer id;
	private String name;
	
	public Animal() {
		
	}
	
	public Animal(Integer id,String name) {
		this.id = id;
		this. name = name;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compare(Animal o1, Animal o2) {
		System.out.println(o1+"....."+o2);
		return o1.getId()-o2.getId();
	}
}
