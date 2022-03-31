# 桥接模式

```mermaid
classDiagram
Reporter --* Report

Report : Reporter reporter
Report : void addReportItem(Object item)
Report : String getReport()

Reporter : String header, trailer, report
Reporter : void addLine()
Reporter : void setHeader()
Reporter : void setTrailer()
Reporter : String getReport()

Report <-- StockListReport

StockListReport : ArrayList stock
StockListReport : void addStockItem()

Report <-- HRReport

HRReport : ArrayList staff
HRReport : void addStaffItem()

Reporter <-- HTMLReporter

HTMLReporter : HTMLReporter()
HTMLReporter : void addLine()

Reporter <-- TextReporter

TextReporter : void addLine()
```

## Input Sample

```java
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
```

## Output

```
<html>
<head></head>
<body>
Name: Bob Department: Development<br>
</body>
</html>
Name: Milk Type: Drink Count: 10
Name: Bread Type: Food Count: 20
```