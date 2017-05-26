
public class GOver extends GameState{
	
	public String endingText;

	public GOver(Game game) {
		super(game);
		endingText = "";
	}
	
	public void alphabetPressed(String key) {
		endingText += key;
	}
	
	public void spacePressed() {
		game.exit();
	}
	
	public void update() {
		game.centerText = "GAME OVER!!";
		game.centerText2 = "PLEASE ENTER YOUR NAME: " + endingText.toUpperCase();
		game.centerText3 = "PRESS SPACE TO GO BACK";
	}

}
