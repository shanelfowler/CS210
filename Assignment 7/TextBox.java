import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class TextBox extends JFrame
{
   private JPanel textPanel;
   private JPanel mainPanel;
   private JTextArea textArea;
   private JScrollPane textScroll;
   private JTextField wordField;
   private JTextField charField;
   private JTextField lineField;
   private JLabel word;
   private JLabel chara;
   private JLabel line;
   private JButton processText = new JButton("Process the Text");
   private ButtonListener listen = new ButtonListener();
   
   public TextBox()
   {
      setTitle("Text Counter");
      setSize(350, 250);
      
      processText.addActionListener(listen);
     
      createTextField();     
      createTextArea();
      createPanel();    
      
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }
   
   public void createTextField()
   {
      word = new JLabel("Number of Words: ");
      wordField = new JTextField(3);
      wordField.setEditable(false);
      
      chara = new JLabel("Number of Chars: ");
      charField = new JTextField(3);
      charField.setEditable(false);
      
      line = new JLabel("Number of Lines: ");
      lineField = new JTextField(3);
      lineField.setEditable(false);
   }
   
   public void createTextArea()
   {
      textArea = new JTextArea(5,30);
      textArea.setLineWrap(true);
      textArea.setWrapStyleWord(true);
      textScroll = new JScrollPane(textArea);
   }
   
   public void createPanel()
   {
       textPanel = new JPanel();
       textPanel.setLayout(new GridLayout(0, 2));
       
       textPanel.add(word);
       textPanel.add(wordField);
       
       textPanel.add(chara);
       textPanel.add(charField);
       
       textPanel.add(line);
       textPanel.add(lineField);
       
       mainPanel = new JPanel();
       mainPanel.setLayout(new BorderLayout());
       
       mainPanel.add(textPanel, BorderLayout.NORTH);
       mainPanel.add(textScroll, BorderLayout.CENTER);
       mainPanel.add(processText, BorderLayout.SOUTH);
       
       add(mainPanel);
   }
   
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent evt)
      {
         int wordCount = 0;
         int charCount = 0;
         int lineCount = 0;
         
         String word;
         String chara;
         String line;
         
         String text = textArea.getText();
         StringTokenizer tk = new StringTokenizer(text, " ");
         
         if(processText.isSelected())
         {
            while(tk.hasMoreTokens())
            {
              String token = tk.nextToken();
              wordCount++; 
            }
         }
         
         word = Integer.toString(wordCount);
         wordField.setText(word);
      }
   }
   
   public static void main(String[] args)
   {
      new TextBox();
   }
}