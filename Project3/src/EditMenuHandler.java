import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;


public class EditMenuHandler implements ActionListener {
	
	public boolean format(String text){
		if(text.length() != 8) return false;				
		int textDate = Integer.parseInt(text);
		int length = String.valueOf(textDate).length();
		if(length != 8) return false;
		String mm = String.valueOf(textDate).substring(4,5);
		String dd = String.valueOf(textDate).substring(6,7);
		if(Integer.parseInt(mm) >= 12 || Integer.parseInt(mm) <= 00) return false;
		if(Integer.parseInt(dd) >= 31 || Integer.parseInt(dd) < 01) return false;
		
		return true;
	}
	
   JFrame jframe;
   public EditMenuHandler (JFrame jf) {
      jframe = jf;
   }
   public void actionPerformed(ActionEvent event) {
      //menu
	  String menuName = event.getActionCommand();
      if (menuName.equals("Insert")){
    	  //TODO Insert input dialog
    	  String text = null;
    	  JFrame frame = new JFrame(text);
    	  String Edit =  JOptionPane.showInputDialog(null, "Enter date in correct format (yyyymmdd)", frame);
    	  
    	   
    	  if(format(Edit) == false){
    		  throw new IllegalArgumentException("Incorrect format: " + text);
    	  }
    	  BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("word.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  try {
			writer.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
    	  try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }    	
 }//actionPerformed

} // class

