import java.awt.event.*;

import javax.swing.JFrame;

//这是本工程的主类，同时也是一个窗口
//这个类还同时承担着MVC构架中控制器的角色，接收用户键盘输入,并实现Observer接口
public class MyController extends JFrame implements KeyListener, Observer {
	MyModel myModel; // 模型Model
	MyView myView; // 视图View

	public MyController() {
		myModel = new MyModel(500, 500, 200, 200, 20, 20);
		myView = new MyView(myModel);
//创建视图，用模型对象配置
		myModel.attach(this); // 控制器向模型注册
		myModel.attach(myView); // 视图向模型注册
		this.setContentPane(myView);
		this.setSize(1024, 768);
//设置内容面板
//设置窗口缺省大小
		this.addKeyListener(this);
//添加键盘监听者
		this.addWindowListener(new WindowAdapter() {
//添加窗口关闭按钮
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new MyController();
	}

	@Override
	public void keyPressed(KeyEvent e) {
//控制器接收到用户键盘事件后，根据不同的键盘命令调用模型的不同服务方法
		if (e.getKeyCode() == KeyEvent.VK_W) {
			myModel.moveUp();
		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			myModel.moveDown();
		} else if (e.getKeyCode() == KeyEvent.VK_A) {
			myModel.moveLeft();
		} else if (e.getKeyCode() == KeyEvent.VK_D) {
			myModel.moveRight();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

//Observer接口方法，这里无需做什么
	@Override
	public void update() {
	}
}