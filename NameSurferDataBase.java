import java.io.*;
import java.util.HashMap;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;


/*
 * File: NameSurferDataBase.java
 * -----------------------------
 * This class keeps track of the complete database of names.
 * The constructor reads in the database from a file, and
 * the only public method makes it possible to look up a
 * name and get back the corresponding NameSurferEntry.
 * Names are matched independent of case, so that "Eric"
 * and "ERIC" are the same names.
 */

public class NameSurferDataBase implements NameSurferConstants {
  
/* Constructor: NameSurferDataBase(filename) */
/**
 * Creates a new NameSurferDataBase and initializes it using the
 * data in the specified file.  The constructor throws an error
 * exception if the requested file does not exist or if an error
 * occurs as the file is being read.
 */
	public void NameSurferDataBasee() {	
		
		try
		{
			BufferedReader rd=new BufferedReader(new FileReader("names-data.txt"));
			while(true)
			{
				line=rd.readLine();
				if(line==null) break;
				hu=parseline(line);
				recorddatabase.put(namefromstringline,hu);
				
				
			}
		}catch(IOException x)
		{
		}
			

	}
	public NameSurferEntry parseline(String takenfromreadline)
	{
		int p=takenfromreadline.indexOf(" ");
		namefromstringline=takenfromreadline.substring(0,p);
		int p1=takenfromreadline.indexOf(" ",p+1);
		int first=Integer.parseInt(takenfromreadline.substring(p+1,p1));//imp bout the parsing int
		int p2=takenfromreadline.indexOf(" ",p1+1);
		int second=Integer.parseInt(takenfromreadline.substring(p1+1,p2));
		int p3=takenfromreadline.indexOf(" ",p2+1);
		int third=Integer.parseInt(takenfromreadline.substring(p2+1,p3));
		int p4=takenfromreadline.indexOf(" ",p3+1);
		int fourth=Integer.parseInt(takenfromreadline.substring(p3+1,p4));
		int p5=takenfromreadline.indexOf(" ",p4+1);
		int fifth=Integer.parseInt(takenfromreadline.substring(p4+1,p5));
		int p6=takenfromreadline.indexOf(" ",p5+1);
		int sixth=Integer.parseInt(takenfromreadline.substring(p5+1,p6));
		int p7=takenfromreadline.indexOf(" ",p6+1);
		int seventh=Integer.parseInt(takenfromreadline.substring(p6+1,p7));
		int p8=takenfromreadline.indexOf(" ",p7+1);
		int eighth=Integer.parseInt(takenfromreadline.substring(p7+1,p8));
		int p9=takenfromreadline.indexOf(" ",p8+1);
		int ninth=Integer.parseInt(takenfromreadline.substring(p8+1,p9));
		int p10=takenfromreadline.indexOf(" ",p9+1);
		int tenth=Integer.parseInt(takenfromreadline.substring(p9+1,p10));
		int p11=takenfromreadline.indexOf(" ",p10+1);
		int eleventh=Integer.parseInt(takenfromreadline.substring(p10+1));
		return(new NameSurferEntry(namefromstringline,first,second,third,fourth,fifth,sixth,seventh,eighth,ninth,tenth,eleventh));
		
		}
      
	public NameSurferEntry returningthekeyofhashmap(String enterkey)
	{
		return recorddatabase.get(enterkey);
	}
	
/* Method: findEntry(name) */
/**
 * Returns the NameSurferEntry associated with this name, if one
 * exists.  If the name does not appear in the database, this
 * method returns null.
 */
	public NameSurferEntry findEntry(String name) {
		// You need to turn this stub into a real implementation //
		return null;
	}
	private String line;
	private String namefromstringline;
	private HashMap<String,NameSurferEntry> recorddatabase=new HashMap<String,NameSurferEntry>();
	private NameSurferEntry hu;
}

