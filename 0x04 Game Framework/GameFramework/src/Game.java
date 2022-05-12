import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

// 游戏的主类，其职责有二：1、充当游戏窗口；2、场景管理者；3、接收鼠标键盘输入
public class Game extends JFrame implements KeyListener, MouseListener{
	protected GameScene curScene;	// 游戏当前的场景
	// 在构造函数设置并启动初始场景的仿真循环
	public Game(GameScene scene) {
		setCurScene(scene);
		this.setSize(1024, 768);	// 设置窗口缺省大小
		this.addKeyListener(this);	// 添加键盘监听
		this.addMouseListener(this);	// 添加鼠标监听
		this.addWindowListener(new WindowAdapter(){	// 添加窗口关闭按钮
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public void setCurScene(GameScene scene) {	// 设置当前场景
		curScene = scene;
		this.setContentPane(scene);
		if(curScene != null) {
			curScene.startRun();	// 启动当前游戏场景的仿真循环
		} else {
			System.out.println("初始化游戏场景失败！");
		}
	}
	public static void main(String[] args) {	// 主函数，由应用程序改写
		Game game = new Game(new GameScene());
		game.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		curScene.keyPressed(ke);
	}
	@Override
	public void mouseClicked(MouseEvent me) {
		curScene.mouseClicked(me);
	}

	@Override
	public void keyReleased(KeyEvent ke) {}
	@Override
	public void keyTyped(KeyEvent ke) { }
	@Override
	public void mouseEntered(MouseEvent me) {}
	@Override
	public void mouseExited(MouseEvent me) {}
	@Override
	public void mousePressed(MouseEvent me) {}
	@Override
	public void mouseReleased(MouseEvent me) {}
}