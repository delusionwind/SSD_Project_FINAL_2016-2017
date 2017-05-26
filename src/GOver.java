
public class GOver extends GameState{

	public GOver(Game game) {
		super(game);
	}
	
	public void alphabetPressed(String key) {
		game.endingText += key;
	}
	
	public void spacePressed() {
		game.exit();
	}
	
	public void update() {
		game.centerText = "GAME OVER!!";
		game.centerText2 = "PLEASE ENTER YOUR NAME: " + game.endingText.toUpperCase();
		game.centerText3 = "PRESS SPACE TO GO BACK";
	}

}
