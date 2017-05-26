
public abstract class GameState {
	protected Game game;
	
	public GameState(Game game) {
		this.game = game;
	}
	
	public void alphabetPressed() { }
	
	public void spacePressed() { }
	
	public void update() { }

}
