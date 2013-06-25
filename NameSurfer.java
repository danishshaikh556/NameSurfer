/*
 * File: NameSurfer.java
 * ---------------------
 * When it is finished, this program will implements the viewer for
 * the baby-name database described in the assignment handout.
 */

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class NameSurfer extends Program implements NameSurferConstants {
  
	public static void main( String[] args){
		new NameSurfer().start(args);
	}
/* Method: init() */
/**
 * This method has the responsibility for reading in the data base
 * and initializing the interactors at the bottom of the window.
 */
	public void init() {
		//Adding to the screen the buttons on the SOUTH
	   nametag=new JLabel("Enter the name you want to search");
	   add(nametag,SOUTH);
	   
	   nameentry=new JTextField(20);
	   nameentry.setActionCommand("GRAPH");
	   nameentry.addActionListener(this);
	   add(nameentry,SOUTH);
	   
	   graph=new JButton("GRAPH");
	   add(graph,SOUTH);
	   clear=new JButton("CLEAR");
	   add(clear,SOUTH);
	   addActionListeners();
	   
	   h=new NameSurferDataBase();
	   h.NameSurferDataBasee();
	   
	   q=new NameSurferGraph();
	   add(q);
	   
	  
	   
	}

/* Method: actionPerformed(e) */
/**
 * This class is responsible for detecting when the buttons are
 * clicked, so you will have to define a method to respond to
 * button actions.
 */
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("GRAPH")) 
		{
		 NameSurferEntry p=h.returningthekeyofhashmap(nameentry.getText());
		 if(p==null) return;   //takes care of the condition that if the user enters a name nt in the list
		 q.addEntry(p);
			
		}
		if(e.getActionCommand().equals("CLEAR"))  q.clear();
			
	}
	private JLabel nametag;
	private JTextField nameentry;
	private JButton graph;
	private JButton clear;
	private NameSurferDataBase h;
	private NameSurferGraph q;
	 
}
