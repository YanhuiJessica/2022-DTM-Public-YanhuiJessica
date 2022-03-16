import java.util.HashSet;
import java.util.Set;

//终结符表达式类
class TerminalExpression implements AbstractExpression {
	private Set<String> set = new HashSet<String>(); //保存了所有的终结符，这里就是城市或人群
	public TerminalExpression(String[] data) {
		for (int i = 0; i < data.length; i++) set.add(data[i]);
	}
	//检查输入参数是否包含在自己保存的终结符集合中，如果是则返回true，否则返回false
	public boolean interpret(String info) {
		if (set.contains(info)) {
				return true;
		}
		return false;
	}
}