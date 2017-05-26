

public class Person {

	private String name;
	private int score;
	private int accuracy;
	private int enemyKill;
	
	public Person(){
		this.name = "";
		this.score = 0;
	    this.accuracy = 0;
	    this.enemyKill = 0;
	}
	
	public Person(String name,int score ,int accuracy,int enemy){

		this.name = name;
		this.score = score;
	    this.accuracy = accuracy;
	    this.enemyKill = enemy;
	    
	}
	
	public int getKill() {
		return this.enemyKill;
	}
	
	public void setKill(int e) {
		this.enemyKill= 0;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public int getAccuracy() {
		return accuracy;
	}
}
