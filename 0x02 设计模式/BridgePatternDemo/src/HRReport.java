import java.util.ArrayList;

//具体的 HR 报告类
public class HRReport extends Report {
	ArrayList staff = new ArrayList();

	public HRReport(Reporter reporter) {
		super(reporter);
	}

	public void addStaffItem(StaffItem staffItem) {
		staff.add(staffItem);
		addReportItem(staffItem);
	}
}