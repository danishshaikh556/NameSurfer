/*
 * File: NameSurferEntry.java
 * --------------------------
 * This class represents a single entry in the database.  Each
 * NameSurferEntry contains a name and a list giving the popularity
 * of that name for each decade stretching back to 1900.
 */

import acm.util.*;
import java.util.*;
import java.io.*;
import java.util.HashMap;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class NameSurferEntry implements NameSurferConstants {

/* Constructor: NameSurferEntry(line) */
/**
 * Creates a new NameSurferEntry from a data line as it appears
 * in the data file.  Each line begins with the name, which is
 * followed by integers giving the rank of that name for each
 * decade.
 */
  public NameSurferEntry(String line,int ost,int snd,int trd,int fth,int fith,int sith,int seth,int eth,int nth,int teth,int eleth) {
		name=line;
		decade1=ost;
		decade2=snd;
		decade3=trd;
		decade4=fth;
		decade5=fith;
		decade6=sith;
		decade7=seth;
		decade8=eth;
		decade9=nth;
		decade10=teth;
		decade11=eleth;
		
		
		
		
		
		
	}

/* Method: getName() */
/**
 * Returns the name associated with this entry.
 */
	public String getName() {
		
		return name;
	}

/* Method: getRank(decade) */
/**
 * Returns the rank associated with an entry for a particular
 * decade.  The decade value is an integer indicating how many
 * decades have passed since the first year in the database,
 * which is given by the constant START_DECADE.  If a name does
 * not appear in a decade, the rank value is 0.
 */
	public int getRank(int decade) {
		switch(decade)
		{
				case 0: return decade1;
		        case 1: return decade2;
		        case 2: return decade3;
		        case 3: return decade4;
		        case 4: return decade5;
		        case 5: return decade6;
		        case 6: return decade7;
		        case 7: return decade8;
		        case 8: return decade9;
		        case 9: return decade10;
		        case 10: return decade11;
		        default: return -1;
		       
		}
	}

/* Method: toString() */
/**
 * Returns a string that makes it easy to see the value of a
 * NameSurferEntry.
 */
	public String toString() {
		// You need to turn this stub into a real implementation //
		return""+ name +""+ decade1 +""+ decade2 +"" ;
	}
	
	private String name;
	private int decade1;
	private int decade2;
	private int decade3;
	private int decade4;
	private int decade5;
	private int decade6;
	private int decade7;
	private int decade8;
	private int decade9;
	private int decade10;
	private int decade11;
	
	private NameSurferDataBase m=new NameSurferDataBase();
	
}

