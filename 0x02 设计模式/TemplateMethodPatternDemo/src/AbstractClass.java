
public abstract class AbstractClass {
	abstract protected void operation1();
	protected void operation2() {}
	protected void operation3() {
		System.out.println("执行具体方法3");
	}
	public void templateMethod() {
		operation1();
		operation2();
		operation3();
	}
}
