
public class MyGameScene extends GameScene {
	public MyGameScene() {
		super();
		NPC npc = new NPC(240,150,120,60);
		this.addGameObject(new Avatar(300,360,60,12, npc));
		this.addGameObject(npc);
	}
}
