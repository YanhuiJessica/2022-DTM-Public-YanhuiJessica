import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	private String id, name;
	private float salary;
	private Date birthday;
	public Employee() {}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	public Date getBirthday() {
		return birthday;
	}
}
