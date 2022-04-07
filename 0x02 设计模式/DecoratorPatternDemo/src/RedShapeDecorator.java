//RedShapeDecorator.java 具体的装饰
public class RedShapeDecorator extends ShapeDecorator {
	public RedShapeDecorator(IShape decoratedShape) {
		super(decoratedShape);
	}

	public void draw() {
		decoratedShape.draw();
		//先绘制包含的IShape
		setRedBorder(decoratedShape);
		//然后再进行自己的绘制
	}

	private void setRedBorder(IShape decoratedShape) {// 绘制红色边框
		System.out.println("我有红边框！");
	}
}