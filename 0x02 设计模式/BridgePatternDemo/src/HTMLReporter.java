//html格式的具体报告类
public class HTMLReporter extends Reporter {
	public HTMLReporter() {
		setHeader("<html>\n<head></head>\n<body>\n");
		setTrailer("</body>\n</html>");
	}

	public void addLine(String line) {
		report += line + "<br>\n";
	}
}