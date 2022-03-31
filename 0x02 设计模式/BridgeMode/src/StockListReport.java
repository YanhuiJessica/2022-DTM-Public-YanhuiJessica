import java.util.ArrayList;

//具体的仓储报告类
public class StockListReport extends Report {
	ArrayList stock = new ArrayList();

	public StockListReport(Reporter reporter) {
		super(reporter);
	}

	public void addStockItem(StockItem stockItem) {
		stock.add(stockItem);	// 添加存储项
		addReportItem(stockItem);	// 添加报告项
	}
}