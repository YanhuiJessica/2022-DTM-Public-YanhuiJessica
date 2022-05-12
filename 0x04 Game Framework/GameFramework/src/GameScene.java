import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

// 游戏场景，具有以下三大功能：1、容纳游戏世界，所以包含一组游戏对象；2、负责渲染游戏世界，所以是
// JPanel 的子类；3、游戏仿真，所以拥有一个动画线程，实现 Runnable 接口
public class GameScene extends JPanel implements Runnable {
	protected ArrayList<IGameObject> allGameObjects = new ArrayList<IGameObject>();	// 游戏世界中的所有游戏对象
    Thread gameLoop;    // 游戏线程
    public GameScene() {
        gameLoop = new Thread(this);
    }
    // 留给客户的方法，用来启动游戏仿真循环
    public void startRun() {
        gameLoop.start();
    }
    // 不允许子类重写
    public final void run() {
        while(gameLoop != null) {
            for(IGameObject go : allGameObjects) {
                go.perform();
            }
            repaint();  // 请求系统重画，触发 paint 方法
            try {
                Thread.sleep(40);   // 暂停线程，形成游戏动画
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    // 渲染游戏对象
    public void paint(Graphics g) {
        g.setColor(Color.white);   // 清理屏幕残留
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        for(IGameObject go : allGameObjects) {
            go.render(g);
        }
    }
    public void addGameObject(IGameObject go) {
        allGameObjects.add(go);
    }
    public void removeGameObject(IGameObject go) {
        allGameObjects.remove(go);
    }
    public void keyPressed(KeyEvent ke) {
        for(IGameObject go : allGameObjects) {
            go.keyPressed(ke);
        }
    }
    public void mouseClicked(MouseEvent me) {
        for(IGameObject go : allGameObjects) {
            go.mouseClicked(me);
        }
    }
}
