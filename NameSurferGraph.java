/*
 * File: NameSurferGraph.java
 * ---------------------------
 * This class represents the canvas on which the graph of
 * names is drawn. This class is responsible for updating
 * (redrawing) the graphs whenever the list of entries changes or the window is resized.
 */

import acm.graphics.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class NameSurferGraph extends GCanvas
  implements NameSurferConstants, ComponentListener {

	/**
	* Creates a new NameSurferGraph object that displays the data.
	*/
	public NameSurferGraph() {
		addComponentListener(this);
		int wide=getWidth()/11;
		int height=getHeight();
		int num=wide/2;
		int year=1990;
		for(int m=1;m<=11;m++)
		{
			add(new GLabel(""+ year +"",num,getHeight()-GRAPH_MARGIN_SIZE-3));
			num +=wide;
			year+=10;
		}
		 for(int j=1;j<=10;j++)
		 {
			  add(new GLine(wide*j,0,wide*j,height));
			  
		 }
		 add(new GLine(0,GRAPH_MARGIN_SIZE,getWidth(),GRAPH_MARGIN_SIZE));
		 add(new GLine(0,getHeight()-GRAPH_MARGIN_SIZE,getWidth(),getHeight()-GRAPH_MARGIN_SIZE));
		 arey=new ArrayList<NameSurferEntry>();
		 
		 
		
		
		
		


	}
	
	/**
	* Clears the list of name surfer entries stored inside this class.
	*/
	public void clear() {
		removeAll();
		arey.clear();
		update();
		//	 You fill this in //
	}
	
	/* Method: addEntry(entry) */
	/**
	* Adds a new NameSurferEntry to the list of entries on the display.
	* Note that this method does not actually draw the graph, but
	* simply stores the entry; the graph is drawn by calling update.
	*/
	public void addEntry(NameSurferEntry entry) {

      arey.add(entry);
      update();
	
	}
	
	
	
	/**
	* Updates the display image by deleting all the graphical objects
	* from the canvas and then reassembling the display according to
	* the list of entries. Your application must call update after
	* calling either clear or addEntry; update is also called whenever
	* the size of the canvas changes.
	*/
	public void update() {
		removeAll();
//		Drawing the vertical seperations
		int wide=getWidth()/11;
		int height=getHeight();
		int num=wide/2;
		int year=1900;
		for(int m=1;m<=11;m++)
		{
			add(new GLabel(""+ year +"",num,getHeight()-GRAPH_MARGIN_SIZE+10));
			num +=wide;
			year+=10;
		}
		 for(int j=1;j<=10;j++)
		 {
			  add(new GLine(wide*j,0,wide*j,height));
		 }
		 add(new GLine(0,GRAPH_MARGIN_SIZE,getWidth(),GRAPH_MARGIN_SIZE));
		 add(new GLine(0,getHeight()-GRAPH_MARGIN_SIZE,getWidth(),getHeight()-GRAPH_MARGIN_SIZE));
		 double r=getHeight();
		 for(int lo=0;lo<arey.size();lo++)
		 {
			 NameSurferEntry op=arey.get(lo);
			 int d=0;
			 int s=1;
			 for(int z=0;z<10;z++)
			 {   
				 double p=(double)op.getRank(z);
				 double u=(double)op.getRank(z+1);
				 add(new GLine(wide*d,(20.00)+((p*r)/1000),wide*s,(20.00)+((u*r)/1000)));
				 d++;
				 s++;
				 
			 
			 }
		 
		 }
		 

	}
	
	
	
	
	/* Implementation of the ComponentListener interface */
	public void componentHidden(ComponentEvent e) { }
	public void componentMoved(ComponentEvent e) { }
	public void componentResized(ComponentEvent e) { update(); }
	public void componentShown(ComponentEvent e) { }
	private ArrayList<NameSurferEntry> arey;
}
