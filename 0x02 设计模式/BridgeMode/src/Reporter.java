//抽象的报告格式类
public abstract class Reporter {
	String header = "";
	String trailer = "";
	String report = "";

	public abstract void addLine(String line);

	public void setHeader(String header) {
		this.header = header;
	}

	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}

	public String getReport() {
		return header + report + trailer;
	}
}