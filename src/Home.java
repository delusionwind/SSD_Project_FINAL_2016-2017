import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JToolBar;
import javax.swing.JTextPane;
import java.awt.TextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SpringLayout;
import javax.swing.border.CompoundBorder;
import javax.swing.table.DefaultTableModel;

public class Home extends JFrame{
	
	public static final int HEIGHT = 900, WIDTH = 600;
	private JTable table;
	private JTextField textField;

	public Home() {
		super("Game Project");

		initHomeData();
		this.setPreferredSize(new Dimension(HEIGHT,WIDTH));
		pack();
		
	}
	
	private void initHomeData() {
	
	getContentPane().setLayout(null);
		
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
		
		textField = new JTextField();
		textField.setBounds(589, 15, 268, 283);
		getContentPane().add(textField);
		textField.setColumns(10);
	
	

	}
	
	public static void main(String[] args) {
		Home home = new Home();
		home.setVisible(true);
		home.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
