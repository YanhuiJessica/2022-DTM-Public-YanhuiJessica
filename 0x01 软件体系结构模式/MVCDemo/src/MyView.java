import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

//这是一个Swing库中的内容面板JPanel，充当着MVC构架中的视图角色，负责渲染模型数据
public class MyView extends JPanel implements Observer {
	MyModel myModel;

//引用的模型对象
	public MyView(MyModel m) {
		myModel = m;
	}

//Observer接口方法
	@Override
	public void update() {
		repaint();
//请求系统重画面板
	}

	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		myModel.render(g);
	}
}