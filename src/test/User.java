package test;

public class User {

	 private String name;
	 private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAger() {
		return age;
	}
	public void setAger(Integer ager) {
		this.age = ager;
	}
	public User(String name, Integer ager) {
		super();
		this.name = name;
		this.age = ager;
	}

	public User() {
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
}
