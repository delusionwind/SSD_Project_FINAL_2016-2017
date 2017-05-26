
public class GPause extends GameState{

	public GPause(Game game) {
		super(game);
	}
	
	public void spacePressed() {
		game.setState(new GPlaying(game));
	}
	
	public void update() {
		game.centerText = "PRESS SPACE TO CONTINUE";
	}
	
}
