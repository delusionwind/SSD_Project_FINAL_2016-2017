
public class EnemyA implements IEnemy{
	
	private int x;
	private int y;
	private float vX;
	private String word;
	private int damage;
	
	public EnemyA(int x, int y, float vX, String word) {
		this.x = x;
		this.y = y;
		this.vX = vX;
		this.word = word;
		damage = 0;
	}
	
	@Override
	public void move() {
		if(dead()) {
			return;
		}
		x -= vX;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public String getString() {
		return word.substring(damage);
	}

	@Override
	public boolean dead() {
		if(damage == word.length()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean reach() {
		if(x <= 0) {
			return true;
		}
		return false;
	}

	@Override
	public void damaged() {
		x += 10;
		damage++;
	}

	@Override
	public String currentString() {
		if(dead()) {
			return "";
		}
		return word.charAt(damage) + "";
	}

	@Override
	public int length() {
		return word.length();
	}
	
}
