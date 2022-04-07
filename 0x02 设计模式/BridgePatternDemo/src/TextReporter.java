//text格式的具体报告类
public class TextReporter extends Reporter {
	public void addLine(String line) {
		report += line + "\n";
	}
}