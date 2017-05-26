import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Abyss extends JFrame implements Observer{
	
	public static final int HEIGHT = 900, WIDTH = 600;
	
	private JPanel panel;
	private Game game;
	
	public Abyss() {
		super("Abyss Mode");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addKeyListener(new KeyControl());
		initComponents();
		pack();
	}
	
	private void initComponents(){
		panel = new JPanel() {
			{
				setPreferredSize(new Dimension(HEIGHT,WIDTH));
			}
			
			@Override
			public void paint(Graphics g) {
				super.paint(g);
				//
			}
		};
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		repaint();
		
	}
	
	class KeyControl extends KeyAdapter {
		
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			if( e.getKeyChar() >= 97 && e.getKeyChar() <= 122 ) {
				//
			}else if( e.getKeyChar() == 32 ) {
				//
			}
		}
	}
		
	
	//temporary for testing this JFrame
	public static void main(String[] args) {
		
	}
}
