
public class StaffItem implements Item {
	String StaffName, Department;
	
	public StaffItem(String name, String department) {
		StaffName = name;
		Department = department;
	}
	
	public String toString() {
		return "Name: " + StaffName + " Department: " + Department;
	}
}
