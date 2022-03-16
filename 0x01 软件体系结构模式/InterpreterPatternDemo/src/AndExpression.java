//非终结符表达式类,检查“X城市的Y人”是否符合免费条件
class AndExpression implements AbstractExpression {
	private AbstractExpression city = null;
	private AbstractExpression person = null;
	public AndExpression(AbstractExpression city, AbstractExpression person) {
		//构造“X城市的Y人”表达式
		this.city = city;
		this.person = person;
	}
	public boolean interpret(String info) {
		String s[] = info.split("的"); //用“的”字分割，找出info参数中的城市和人群
		return city.interpret(s[0]) && person.interpret(s[1]); //检查是否满足条件
	}
}