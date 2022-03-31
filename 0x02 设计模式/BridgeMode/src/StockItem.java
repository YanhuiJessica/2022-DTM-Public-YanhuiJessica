
public class StockItem implements Item {
	String StockName, StockType;
	int StockNum;
	
	public StockItem(String name, String type, int num) {
		StockName = name;
		StockType = type;
		StockNum = num;
	}
	
	public String toString() {
		return "Name: " + StockName + " Type: " + StockType + " Count: " + StockNum;
	}
}
