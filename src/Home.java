import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Home extends JFrame{
	
	public static final int HEIGHT = 900, WIDTH = 600;

	public Home() {
		initHomeData();
		this.setPreferredSize(new Dimension(HEIGHT,WIDTH));
		pack();
		
	}
	
	private void initHomeData() {
		
	}
	
	public static void main(String[] args) {
		Home home = new Home();
		home.setVisible(true);
		home.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
