import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class NPC implements IGameObject {
    int x, y; // 坐标
    int w, h; // 宽，高
    Color color = Color.blue;
    public NPC(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    public void update(int ax, int ay) {
        if (ax >= x && ax <= x + w && ay >= y && ay <= y + h) {
            color = Color.green;
        } else {
        	color = Color.blue;
        }
    }
    @Override
    public void render(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, w, h);
    }
    @Override
    public void keyPressed(KeyEvent ke) {}
    @Override
    public void mouseClicked(MouseEvent me) {}
    @Override
    public void perform() {}
}
