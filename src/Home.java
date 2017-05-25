
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import javax.swing.table.DefaultTableModel;

public class Home extends JFrame{
	
	public static final int HEIGHT = 900, WIDTH = 600;
	private JTable table;

	public Home() {
		super("Game Project");

		initHomeData();
		this.setPreferredSize(new Dimension(HEIGHT,WIDTH));
		pack();
		
	}
	
	private void initHomeData() {
	
	getContentPane().setLayout(null);
		
		JTextPane txtpnHowToPlay = new JTextPane();
		txtpnHowToPlay.setBounds(589, 11, 268, 279);
		txtpnHowToPlay.setText("How to Play");
		getContentPane().add(txtpnHowToPlay);
		
		JButton StartButton = new JButton("Start");
		StartButton.setBounds(589, 309, 268, 89);
		StartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		getContentPane().add(StartButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 556, 477);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Number", "Name", "Score", "Accuracy", "Dead Enermy"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton ExitButton = new JButton("Exit");
		ExitButton.setBounds(589, 424, 268, 41);
		getContentPane().add(ExitButton);
	
	

	}
	
	public static void main(String[] args) {
		Home home = new Home();
		home.setVisible(true);
		home.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
