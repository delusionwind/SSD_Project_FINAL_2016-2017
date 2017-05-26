

public class Person {

	private String name;
	private int score;
	private int accuracy;
	
	public Person(){
		this.name = "";
		this.score = 0;
	    this.accuracy = 0;
	}
	
	public Person(String name,int score ,int accuracy){

		this.name = name;
		this.score = score;
	    this.accuracy = accuracy;
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
