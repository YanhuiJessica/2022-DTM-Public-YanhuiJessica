import java.awt.Color;
import java.awt.Graphics;

class Ball {
	private int cx, cy; // 坐标
	private int vx, vy; // 速度
	private int d; // 直径
	public Ball(int cx, int cy, int d, int vx, int vy) {
		this.cx = cx;
		this.cy = cy;
		this.d = d;
		this.vx = vx;
		this.vy = vy;
	}
	public void update(int dx, int dy) {
		cx += dx * vx;
		cy += dy * vy;
	}
	public void render(Graphics g) {
		g.setColor(Color.orange);
		g.fillOval(cx, cy, d, d);
	}
}
