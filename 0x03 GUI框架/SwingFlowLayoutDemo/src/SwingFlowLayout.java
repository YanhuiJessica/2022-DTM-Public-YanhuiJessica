import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class SwingFlowLayout {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Swing流式布局管理器");
		JPanel jPanel = new JPanel();
		Font font = new Font("宋体", Font.PLAIN, 32); // 准备使用的字体
		UIManager.put("Button.font", font);
		JButton btn1 = new JButton("1");
		// 设置所有按钮的字体
		// 创建按钮
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		jPanel.add(btn1);
		// 面板中添加按钮
		jPanel.add(btn2);
		jPanel.add(btn3);
		jPanel.add(btn4);
		jPanel.add(btn5);
		jPanel.add(btn6);
		jPanel.add(btn7);
		jPanel.add(btn8);
		jPanel.add(btn9);
		// 向JPanel添加FlowLayout布局管理器，将组件间的横向和纵向间隙都设置为20像素
		jPanel.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 20));
		jPanel.setBackground(Color.gray);
		jFrame.add(jPanel);
		// 设置背景色
		// 添加面板到容器
		jFrame.setBounds(400, 250, 800, 600);
		// 设置容器的位置和大小
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
