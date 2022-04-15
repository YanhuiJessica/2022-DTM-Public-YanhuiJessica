
public class ConcreteClass extends AbstractClass{

	@Override
	protected void operation1() {
		System.out.println("执行抽象方法1");
	}
	
	protected void operation2() {
		System.out.println("实现钩子方法2");
	}
}
