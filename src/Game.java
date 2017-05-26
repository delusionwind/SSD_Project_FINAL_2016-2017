import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Game extends Observable{
	
	public GameState state;
	public List<IEnemy> enemies = new ArrayList<IEnemy>();
	public boolean wave;
	public boolean running;
	private Thread thread;
	public int score;
	public int killed;
	public int accuracy;
	public int type;
	public int hit;
	public String centerText;
	
	public Game() {
		score = 0;
		killed = 0;
		accuracy = 0;
		type = 0;
		hit = 0;
		centerText = "Press SPACEBAR to START";
		wave = false;
		running = false;
		this.state = new GPause(this);
	}
	
	public void start() {
		running = true;
		thread = new Thread() {
			@Override
			public void run() {
				super.run();
				while(running) {
					if(type == 0) {
						accuracy = 0;
					}else {
						accuracy = (hit*100)/(type);
					}
					if(wave == false) {
						addEnemies();
						wave = true;
					}
					update();
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		thread.start();
		
	}
	
	private void addEnemies() {
		enemies.add(new EnemyA(920,150,3,"HELLO"));
		enemies.add(new EnemyA(920,200,2,"HEL"));
		enemies.add(new EnemyA(920,250,3,"YOLO"));
		enemies.add(new EnemyA(920,300,3,"HI"));
		enemies.add(new EnemyA(920,350,8,"ULTRAMAN"));
		enemies.add(new EnemyA(920,400,2,"SENTAI"));
		enemies.add(new EnemyA(920,450,3,"SEMPAINOTICEME"));
	}
	
	public void alphabetPressed(String key) {
		type++;
		state.alphabetPressed(key);
	}
	
	public void spacePressed() {
		state.spacePressed();
		centerText = "";
	}
	
	public void update() {
		state.update();
		this.setChanged();
		this.notifyObservers();
	}
	
	public void setState(GameState newState) {
		state = newState;
	}

}
