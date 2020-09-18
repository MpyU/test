package homework4;

public class Student implements Comparable<Student>{
	private int id;
	private String username;
	private float score;
	
	public Student() {}
	
	public Student(String username, float score) {
		this.username = username;
		this.score = score;
		this.id = (int)(Math.random()*100+1);
	}

	public Student(int id, String username, float score) {
		super();
		this.id = id;
		this.username = username;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", username=" + username + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student o) {
		int res = 0;
		if(this.getScore() - o.getScore()>0) {
			res = 1;
		}else if(this.getScore() - o.getScore()<0) {
			res = -1;
		}else {
			res = 0;
		}
		return res;
	}
	
	
}
