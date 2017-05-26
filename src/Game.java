import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Game extends Observable{
	
	private GameState state;
	public List<IEnemy> enemies = new ArrayList<IEnemy>();
	
	public Game() {
		
		this.state = new GPause(this);
	}
	
	public void alphabetPressed() {
		state.alphabetPressed();
	}
	
	public void spacePressed() {
		state.spacePressed();
	}
	
	public void update() {
		state.update();
	}

}
