
public class ReportClient {
	public static void main(String[] args) {
		HRReport hrReport = new HRReport(new HTMLReporter());
		hrReport.addStaffItem(new StaffItem("Bob", "Development"));
		System.out.println(hrReport.getReport());
		
		StockListReport stockReport = new StockListReport(new TextReporter());
		stockReport.addStockItem(new StockItem("Milk", "Drink", 10));
		stockReport.addStockItem(new StockItem("Bread", "Food", 20));
		System.out.println(stockReport.getReport());
	}
}
