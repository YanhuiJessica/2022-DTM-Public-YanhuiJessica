
public class SingletonPatternDemo {
	public static void main(String[] args) {
		SingletonObject singleton = SingletonObject.getInstance();
		singleton.doSomething();
	}
}
