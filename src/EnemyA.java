
public class EnemyA implements IEnemy{
	
	private int x;
	private int y;
	private int vX;
	private String word;
	private int height;
	private int width;

	@Override
	public void move() {
		
	}

	@Override
	public int getX() {
		
		return 0;
	}

	@Override
	public int getY() {
		
		return 0;
	}

	@Override
	public String getString() {
		
		return null;
	}

	@Override
	public boolean dead() {
		
		return false;
	}

	@Override
	public boolean reach() {
		
		return false;
	}
	
}
