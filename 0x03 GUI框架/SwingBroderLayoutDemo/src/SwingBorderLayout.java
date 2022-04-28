import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class SwingBorderLayout {
	public static void main(String[] agrs) {
		JFrame frame = new JFrame("Swing边框布局管理器");
		frame.setLayout(new BorderLayout());
//创建Frame窗口
//为Frame窗口设置布局为BorderLayout
		Font font = new Font("宋体", Font.PLAIN, 36); // 准备使用的字体
		UIManager.put("Button.font", font);
//设置所有按钮的字体
		JButton button1 = new JButton("上");
		JButton button2 = new JButton("左");
		JButton button3 = new JButton("中");
		JButton button4 = new JButton("右");
		JButton button5 = new JButton("下");
		frame.add(button1, BorderLayout.NORTH); // 将button1放到北边
		frame.add(button2, BorderLayout.WEST); // 将button2放到西边
		frame.add(button3, BorderLayout.CENTER); // 将button3放到中间
		frame.add(button4, BorderLayout.EAST); // 将button4放到东边
		frame.add(button5, BorderLayout.SOUTH); // 将button5放到南边
		frame.setBounds(500, 500, 1000, 800); // 设置窗口位置和尺寸
		frame.setVisible(true);
//显示窗口
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}