import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import javax.swing.JPanel;

class MyPanel extends JPanel implements KeyListener{
	Ball ball;
	int[] dx = {0, 0, -1, 1};	// 四个移动方向
	int[] dy = {-1, 1, 0, 0};

	public MyPanel() {
		ball = new Ball(0, 0, 100, 20, 20); // 初始化球
	}

	public void animate(int direction) {
		ball.update(dx[direction], dy[direction]);
		this.repaint(); // 呼唤系统重画
	}

	// JPanel的绘图回调函数。Graphics是Java的绘图工具对象。
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, this.getWidth(), this.getHeight()); // 用白色清空屏幕
		ball.render(g);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_W) {
			animate(0);
		} else if (e.getKeyCode() == KeyEvent.VK_S) {
			animate(1);
		} else if (e.getKeyCode() == KeyEvent.VK_A) {
			animate(2);
		} else if (e.getKeyCode() == KeyEvent.VK_D) {
			animate(3);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}
