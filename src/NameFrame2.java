/**
 * ѡ����Ϣ����
 * @author penghui
 *
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

import javax.swing.*;

import ����ϵͳ.FormatException1;
public class NameFrame2 extends JFrame
{ 
	private static final int DEFAULT_WIDTH = 500;
	private static final int DEFAULT_HEIGHT = 400;
	
	private JTextField name = new JTextField(10);
	private JTextField number = new JTextField(10);
	private JButton btn = new JButton("ȷ��");
	final JPanel pan = new JPanel();
	public NameFrame2(final JFrame win,final JPanel pan,final ArrayList<Actor> actors)
	{
	 
	  JLabel lab1 = new JLabel("���");
	  JLabel lab2 = new JLabel("����");
	  win.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
 	  win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	  win.setLocationRelativeTo(null); 
 	  win.setVisible(true);
	  btn.addActionListener(new ActionListener()
	    {
         public void actionPerformed(ActionEvent event)
         { 
			 try
			  {
				    String s = name.getText();
					String q = number.getText();
					if(s.equals("")||q.equals(""))
					{
						throw new FormatException1();
					}
			  }
			  catch(FormatException1 a)
			  {
				 JOptionPane.showMessageDialog(null,"������ѡ����Ϣ");
			  }
			 if(name.getText().compareTo("")!=0 && number.getText().compareTo("")!=0)
			 {
				   win.setVisible(false);
	               final String name11 = new String(name.getText());
	               final String number11 = new String(number.getText());
	            	
	               JFrame win = new JFrame("Сѧ����������");
	          	   JPanel pan = new JPanel();
	          	   try {
					new fuzha(win,pan,name11,number11,actors);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	          	   win.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	          	   win.setVisible(true);
	               win.setLocationRelativeTo(null);
			 }
        }
     });
	  
	  pan.add(lab1);
	  pan.add(number);
	  pan.add(lab2);
	  pan.add(name);
	  pan.add(btn);
	  win.add(pan);
	  win.setVisible(true);
  }
	
}