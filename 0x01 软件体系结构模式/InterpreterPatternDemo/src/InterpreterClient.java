/*文法规则
<expression> ::= <city>的<person>
<city> ::= 北京|上海|广州|深圳
<person> ::= 老人|孕妇|儿童
*/

//客户端类，使用解释器的功能
public class InterpreterClient {
	public static void main(String[] args) {
		Interpreter bus = new Interpreter();  //创建一个解释器
		//使用解释器的功能
		bus.freeRide("北京的老人");
		bus.freeRide("天津的年轻人");
		bus.freeRide("深圳的孕妇");
		bus.freeRide("上海的儿童");
		bus.freeRide("山东的儿童");
		bus.freeRide("成都的老人");
	}
}