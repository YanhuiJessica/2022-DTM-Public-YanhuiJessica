//抽象化的报告类
public abstract class Report {
	Reporter reporter;

	// 雇佣一个Reporter类型的对象，用于实现报告格式
	public Report(Reporter reporter) {
		this.reporter = reporter;
	}

	// 报告有多个报告项组成。这个方法负责添加一个报告项
	public void addReportItem(Object item) {
		reporter.addLine(item.toString());
		// 让报告格式对象添加一个项
	}

	public String getReport() {	// 得到最终的报告
		return reporter.getReport();
	}
}