//ShapeDecorator.java 抽象装饰类
public class ShapeDecorator implements IShape {
	protected IShape decoratedShape;

//包含另一个IShape
	public ShapeDecorator(IShape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	public void draw() {
		if (decoratedShape != null) {	// 空指针保护
			decoratedShape.draw();
		}
	}
}