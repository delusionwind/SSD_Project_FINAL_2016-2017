import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Abyss extends JFrame implements Observer{
	
	public static final int HEIGHT = 900, WIDTH = 600;
	
	private JPanel panel;
	private Game game;
	private List<Person> people = new ArrayList<Person>();
	
	public Abyss(List<Person> people) {
		this.people = people;
		initComponents();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(HEIGHT,WIDTH));
		addKeyListener(new KeyControl());
		game = new Game();
		game.addObserver(this);
		pack();
	}
	
	public void start() {
		game.start();
	}
	
	private void initComponents(){
		panel = new JPanel() {
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				paintBackground(g);
				drawEnemy(g);
			}
		};
		setResizable(false);
		add(panel);
	}
	
	private void paintBackground(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, HEIGHT, WIDTH);
		g.setColor(Color.WHITE);
		g.drawString("SCORE: " + game.score, 200, 20);
		g.drawString("Enemy Killed: " + game.killed, 300, 20);
		g.drawString("Accuracy: " + game.accuracy, 450, 20);
		g.drawString(game.centerText, 400, 300);
		g.drawString(game.centerText2, 350, 320);
		g.drawString(game.centerText3, 400, 340);
	}
	
	private void drawEnemy(Graphics g) {
		for(IEnemy enemy : game.enemies) {
			if(enemy.dead()) {
				continue;
			}
			if(game.state instanceof GPlaying) {
				g.setColor(Color.WHITE);
				g.drawString(enemy.getString() + "", enemy.getX() + 5, enemy.getY() + 20);
			}
			g.setColor(Color.BLUE);
			g.drawRect(enemy.getX(), enemy.getY(), 80, 50);
			
		}
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		repaint();
		if(arg1 != null) {
			exit((Person)arg1);
		}
	}
	
	class KeyControl extends KeyAdapter {
		
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			if( e.getKeyChar() >= 97 && e.getKeyChar() <= 122 ) {
				game.alphabetPressed("" + e.getKeyChar());
			}else if( e.getKeyChar() == 32 ) {
				game.spacePressed();
			}
		}
	}
		
	public void exit(Person p) {
		people.add(p);
		dispose();
	}
	
	//temporary for testing this JFrame
	public static void main(String[] args) {
		Abyss c = new Abyss(new ArrayList<Person>());
		c.setVisible(true);
		c.start();
	}
}
