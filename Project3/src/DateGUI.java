import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DateGUI implements ActionListener{
	JFrame myFrame;
	TextArea rawDates, sortedDates;
	JFileChooser jfc;
	
	public DateGUI() {
		myFrame = new JFrame();
		myFrame.setSize(400, 400);
		myFrame.setLocation(200, 200);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLayout(new GridLayout(1, 2));
		myFrame.setTitle("Dates Display");
		rawDates = new TextArea();
		sortedDates = new TextArea();
		myFrame.getContentPane().add(rawDates);
		myFrame.getContentPane().add(sortedDates);
		createMenu();
		jfc = new JFileChooser();
	}
	private void createMenu() {
		JMenuBar menuBar  = new JMenuBar();
		   JMenu fileMenu = new JMenu("File");
		   JMenu editMenu = new JMenu("Edit");
		   JMenuItem OpenItem = new JMenuItem("Open");
		   JMenuItem QuitItem = new JMenuItem("Quit");
		   JMenuItem InsertItem = new JMenuItem("Insert");
		   OpenItem.addActionListener(this);
		   QuitItem.addActionListener(this);
		   InsertItem.addActionListener(this);
		   fileMenu.add(OpenItem);
		   fileMenu.add(QuitItem);
		   editMenu.add(InsertItem);
		   menuBar.add(fileMenu);
		   menuBar.add(editMenu);
		   myFrame.setJMenuBar(menuBar);
	}
	protected void OpenEvent() {
			jfc.setDialogTitle("Choose a file to read: ");
			int jfcResult = jfc.showOpenDialog(null); //Pass null to center the dialog
			if(jfcResult == JFileChooser.APPROVE_OPTION)
			{
				try
				{			
					Scanner data = new Scanner(new FileReader(jfc.getSelectedFile()));
					while(data.hasNextLine() ) {
						String input = data.nextLine();
					}
				}
				catch(Exception e) {
					
				}
			}
	}
		/* initialize- Sets up the JFrame and makes it so that the values can be
	}
	 	inputed into their correct corresponding columns
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		switch(e.getActionCommand()) {
		case "Open":
			OpenEvent();
			break;
		case "Quit":
			System.exit(0);
			break;
		case "Insert":
			String value = JOptionPane.showInputDialog("Enter a new date in yyyymmdd format:");
			
			break;
		}
	}	
}//DateGUI
