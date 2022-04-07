public class DecoratorPatternDemo {
	public static void main(String[] args) {
		IShape circle = new Circle();
		ShapeDecorator redCircle = new RedShapeDecorator(circle);
		ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("无边框的Circle：");
		circle.draw();
		System.out.println("\n带红色边框的Circle：");
		redCircle.draw();
		System.out.println("\n带红色边框的Rectangle：");
		redRectangle.draw();
	}
}