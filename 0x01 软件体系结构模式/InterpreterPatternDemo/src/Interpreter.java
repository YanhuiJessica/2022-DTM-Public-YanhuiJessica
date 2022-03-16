
//解释器类
class Interpreter {
	private String[] citys = {"北京","上海","广州","深圳"}; //定义规则中符合条件的城市
	private String[] persons = {"老人", "妇女", "儿童"}; //定义规则中符合条件的人群
	private AbstractExpression cityPerson; //完整表达式
	public Interpreter() {
		AbstractExpression city = new TerminalExpression(citys); //创建检验城市的终结符表达式
		AbstractExpression person = new TerminalExpression(persons); //创建检验人群的终结符表达式
		cityPerson = new AndExpression(city, person); //创建检验符合条件的非终结符表达式
	}
	//解释器的功能函数
	public void freeRide(String info) {
		boolean ok = cityPerson.interpret(info); //检查参数语句是否符合免费条件
		if (ok) {
			System.out.println("您是" + info + "，您本次乘车免费！");
		}else{
			System.out.println(info + "，您不是免费人员，本次乘车扣费2元！");
		}
	}
}