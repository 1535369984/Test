
public class User implements Comparable<User> {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
//		System.err.println("调用了toString");
		return this.name + ":" + this.age;
	}

	@Override
	public int compareTo(User o) {
		return this.getAge() - o.getAge() >= 0 ? 1 : 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof User) {
			User obj1 = (User) obj;
			if (this.name.equals(obj1.name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub

		super.finalize();
		System.err.println("对象回收");
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
