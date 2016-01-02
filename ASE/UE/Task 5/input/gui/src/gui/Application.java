package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Application implements ActionListener
{
	public static void main(String[] args) 
	{
		new Application();
	}
	
	private int count = 0;
	private JLabel info;
	private JButton button;
	private JFrame frame;
	
	public Application()
	{
		info = new JLabel( "0 clicks" );
		info.setHorizontalAlignment( JLabel.CENTER );

		button = new JButton( "Click me ..." );
		button.addActionListener( this );
		
		
		frame = new JFrame( "Application Frame" ); 
		Container pane = frame.getContentPane();
		pane.add( info,   BorderLayout.CENTER );
		pane.add( button, BorderLayout.SOUTH  );
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public void actionPerformed( ActionEvent e ) 
	{
		count++;
		info.setText( "" + count + " clicks");
	}
}
