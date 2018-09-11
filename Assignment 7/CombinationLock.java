import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CombinationLock extends JFrame
{
   private JPanel panel = new JPanel();                              
   private String passCode = "735";
   private StringBuilder stb;
   private String input;
     
   //Created an array of 10 buttons
   private JButton[] numbers = {new JButton("0"), new JButton("1"), new JButton("2"),
                                new JButton("3"), new JButton("4"), new JButton("5"),
                                new JButton("6"), new JButton("7"), new JButton("8"),
                                new JButton("9")};    
                                
  public CombinationLock()
  {
      setTitle("Lock");
      setSize(250, 100);
      
      //Method for appearance
      createTemplate();
      //Method to add numbers
      addNumbers();
      
      setVisible(true);
 		setDefaultCloseOperation(EXIT_ON_CLOSE);   
  }
  
  public void createTemplate()
  {
      panel.setLayout(new GridLayout(2,5));
      add(panel);
  }
  
  public void addNumbers()
  {
 	   buttonListener listen = new buttonListener();
 		
 		for(int i = 0; i < numbers.length; i++)
 		{
 			panel.add(numbers[i]);
 			numbers[i].addActionListener(listen);
 		}			
  }
  
  private class buttonListener implements ActionListener
  {
 		public void actionPerformed(ActionEvent e)
 	   {
         while(!(input.equals(passCode)))
         {
            for(int i = 0; i < 3; i++)
 			      stb.append(e.getActionCommand());	
 			
 	         int size = stb.length();
               
 			   input = stb.toString();
 					
 			   if(input.equals(passCode))
            {
 				   JOptionPane.showMessageDialog(null, "Correct.");
               break;
            }
 			   else
 			   {
 				   JOptionPane.showMessageDialog(null, "Wrong, try again.");
 				   size = 0;
 			   }
         }   	
 		}
  }
 
  public static void main(String[] args)
  {
      new CombinationLock();
  }                                
}