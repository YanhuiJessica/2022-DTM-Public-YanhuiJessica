import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

// 游戏对象接口
public interface IGameObject {
	public void perform();
	public void render(Graphics g);
	public void keyPressed(KeyEvent ke);
	public void mouseClicked(MouseEvent me);
}
