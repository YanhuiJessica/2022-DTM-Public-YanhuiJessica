import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SwingGraphics extends JFrame {
	private MyPanel panel = new MyPanel();
	public SwingGraphics() {
		setTitle("WSAD🟧移动小球");
		setBounds(200, 200, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(panel);
		addKeyListener(panel);
	}
	
	public static void main(String[] args) {
		SwingGraphics frame = new SwingGraphics();
		// 给窗口添加面板
		frame.setVisible(true);
	}
}
