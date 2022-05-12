import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Avatar implements IGameObject {
    int x, y; // 坐标
    int d, s;  // 直径，速度
    NPC npc;
    public Avatar(int x, int y, int d, int s, NPC npc) {
        this.x = x;
        this.y = y;
        this.d = d;
        this.s = s;
        this.npc = npc;
    }
    @Override
    public void render(Graphics g) {
        g.setColor(Color.orange);
        g.fillOval(x, y, d, d);
    }
    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode() == KeyEvent.VK_LEFT) {
            x -= s;
            npc.update(x + d / 2, y + d / 2);
        } else if(ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            x += s;
            npc.update(x + d / 2, y + d / 2);
        } else if(ke.getKeyCode() == KeyEvent.VK_UP) {
            y -= s;
            npc.update(x + d / 2, y + d / 2);
        } else if(ke.getKeyCode() == KeyEvent.VK_DOWN) {
            y += s;
            npc.update(x + d / 2, y + d / 2);
        }
    }
    @Override
    public void mouseClicked(MouseEvent me) {}
    @Override
    public void perform() {}
}
