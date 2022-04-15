
public class SingletonObject {
	private static SingletonObject Singleton = new SingletonObject();
	private SingletonObject() {}
	public static SingletonObject getInstance() {
		return Singleton;
	}
	public void doSomething() {
		System.out.println("Hello, World!");
	}
}
