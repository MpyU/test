package test11;

public class User implements Comparable<User>{
	private Integer id;
	private String username;
	
	public User() {
		
	}
	
	public User(Integer id,String username) {
		this.id = id;
		this.username = username;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public int compareTo(User o) {
		if(this.id == o.getId() && this.getUsername().equals(o.getUsername())) {
			return 0;
		}
		int res = -(this.getId() - o.getId());
		return res;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + "]";
	}
	
}
