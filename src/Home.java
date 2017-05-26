import java.awt.Dimension;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import javax.swing.table.DefaultTableModel;

public class Home extends JFrame {

	public static final int HEIGHT = 900, WIDTH = 600;
	private JTable table;

	public List<Person> player = new ArrayList<Person>();
	
	public Home() {
		super("Game Project");

		initHomeData();
		this.setPreferredSize(new Dimension(HEIGHT, WIDTH));
		pack();

	}

	private void initHomeData() {

		getContentPane().setLayout(null);

		JTextPane HowToPlay = new JTextPane();
		HowToPlay.setBounds(589, 11, 268, 279);
		HowToPlay.setText("How to Play");
		getContentPane().add(HowToPlay);

		JButton StartButton = new JButton("Start");
		StartButton.setBounds(589, 324, 268, 99);
		StartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		getContentPane().add(StartButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 556, 477);
		getContentPane().add(scrollPane);

		table = new JTable();
		
		String Type[] = new String[]{ "Rank", "Name", "Score", "Accuracy", "Dead Enermy" };
		
	
		
		table.setModel(new DefaultTableModel(new Object[][] {},
			Type));
		
		
		scrollPane.setViewportView(table);

		JButton ExitButton = new JButton("Exit");
		ExitButton.setBounds(589, 447, 268, 41);
		getContentPane().add(ExitButton);

		ExitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

	}

	public static void main(String[] args) {
		Home home = new Home();
		home.setVisible(true);
		home.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
}
