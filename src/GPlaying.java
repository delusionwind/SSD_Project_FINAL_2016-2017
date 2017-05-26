
public class GPlaying extends GameState{

	public GPlaying(Game game) {
		super(game);
	}
	
	public void alphabetPressed(String key) {
		for(IEnemy enemy : game.enemies) {
			if(key.equalsIgnoreCase(enemy.currentString())) {
				enemy.damaged();
				game.hit++;
				if(enemy.dead()) {
					game.enemies.remove(enemy);
					game.score += 10*enemy.length();
					game.killed++;
					if(game.enemies.isEmpty()) {
						game.wave = false;
					}
				}
				return;
			}
		}
	}
	
	public void spacePressed() {
		game.setState(new GPause(game));
	}
	
	public void update() {
		for(IEnemy enemy : game.enemies) {
			enemy.move();
			if(enemy.reach()) {
				game.running = false;
				game.setState(new GOver(game));
			}
		}
	}

}
