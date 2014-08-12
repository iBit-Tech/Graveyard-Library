package ibittech.graveyard.log;

import ibittech.graveyard.Graveyard;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Used for logging console through the console, and makes a new file as well.
 * Use: on startup (before anything happens), use the deleteLog() method to delete
 * the old log so a new one can be made. Then, use setDirectory to set the directory
 * and name of the file (optional). After that, you should use setPrefix() to
 * set whatever you want your prefix to be (it's javadoc explains it nicely). Then
 * you should probably use log() is say you've just launched your program.
 * 
 * @author xbony2
 *
 */
public class GLog {
	
	/**
	 * The prefix.
	 * 
	 * @author xbony2
	 */
	public static String prefix;
	
	/**
	 * Sets your prefix. This should be done on startup.
	 * 
	 * @param pref should be something like the name of your Program or an abbreviation, 
	 * without spaces.
	 * For example, a Tic Tac Toe program should be "TicTacToe".
	 * A game named World Of Warcraft should be "WoW".
	 * A program named Celsus to Kalvin should be "CelsusToKalvin".
	 * 
	 * @author xbony2
	 */
	public static void setPrefix(String pref){
		prefix = "[" + pref + "]";
	}
	
	/**
	 * The directory (and name) for the log file.
	 * 
	 * @author xbony2
	 */
	public static String directory = "log";
	
	/**
	 * Sets the directory and name of the log file.
	 * 
	 * @param dir is the file's name and directory. On default, the log file is
	 * simply "log" which can also be called "src/log" If I wanted to generate
	 * the log file in this package, I'd input "src/ibittech/graveyard/log/log.
	 * If I wanted it to have a different extension or name, I can change that 
	 * as well, ex: "src/ibittech/graveyard/log/logger.txt" will make a file
	 * named "logger.txt" in this very package.
	 * 
	 * @author xbony2
	 */
	public static void setDirectory(String dir){
		directory = dir;
	}
	
	/**
	 * Deletes the log automatically created by this class. I recommend doing this on
	 * startup, so the log doesn't repeat itself again and again.
	 * 
	 * @author xbony2
	 */
	public static void deleteLog(){
		File log = new File(directory);
		
		if(!log.exists()){
			System.out.println("[" + Graveyard.name + "][ERROR] deleteLog was called, but no log exists!");
		}else{
			log.delete();
		}
	}
	
	/**
	 * To log ordinary messages, ex a startup phases.
	 * 
	 * @param message the message you want to output.
	 * 
	 * @author xbony2
	 */
	public static void log(String message){
		System.out.println(prefix + " " + message);
		
		File log = new File(directory);
	    try{
	    	if(!log.exists()){
	         	System.out.println("[" + Graveyard.name + "] New log created.");
	            log.createNewFile();
	    }
	    	
	    PrintWriter out = new PrintWriter(new FileWriter(log, true));
	    out.println(prefix + " " + message);
	    out.close();
	    }catch(IOException e){
	        System.out.println("[" + Graveyard.name + "][ERROR] Could not make file!");
	    }
	}
	
	/**
	 * To log ordinary messages, ex a startup phases. This version is without
	 * the automatic prefix.
	 * 
	 * @param pre should be something like the name of your Program or an abbreviation, 
	 * without spaces.
	 * For example, a Tic Tac Toe program should be "TicTacToe".
	 * A game named World Of Warcraft should be "WoW".
	 * A program named Celsus to Kalvin should be "CelsusToKalvin".
	 * @param message the message you want to output.
	 * 
	 * @author xbony2
	 */
	public static void log(String pre, String message){
		System.out.println("[" + pre + "] " + message);
		
		File log = new File(directory);
	    try{
	    	if(!log.exists()){
	         	System.out.println("[" + Graveyard.name + "] New log created.");
	            log.createNewFile();
	    }
	    	
	    PrintWriter out = new PrintWriter(new FileWriter(log, true));
	    out.println("[" + pre + "] " + message);
	    out.close();
	    }catch(IOException e){
	        System.out.println("[" + Graveyard.name + "][ERROR] Could not make file!");
	    }
	}
	
	/**
	 * To log an error, like if a value isn't what it should be (Ex: Let's say
	 * an int was used to represent who's turn it was in a chess game, 1 for
	 * the computer, 0 for the player, but the value was 2).
	 * 
	 * @param message the message you want to output.
	 * 
	 * @author xbony2
	 */
	public static void logError(String message){
		System.out.println(prefix + "[ERROR] " + message);
		
		File log = new File(directory);
	    try{
	    	if(!log.exists()){
	         	System.out.println("[" + Graveyard.name + "] New log created.");
	            log.createNewFile();
	    }
	    	
	    PrintWriter out = new PrintWriter(new FileWriter(log, true));
	    out.println(prefix + "[ERROR] " + message);
	    out.close();
	    }catch(IOException e){
	        System.out.println("[" + Graveyard.name + "][ERROR] Could not make file!");
	    }
	}
	
	/**
	 * To log an error, like if a value isn't what it should be (Ex: Let's say
	 * an int was used to represent who's turn it was in a chess game, 1 for
	 * the computer, 0 for the player, but the value was 2). This version is without
	 * the automatic prefix.
	 * 
	 * @param pre should be something like the name of your Program or an abbreviation, 
	 * without spaces.
	 * For example, a Tic Tac Toe program should be "TicTacToe".
	 * A game named World Of Warcraft should be "WoW".
	 * A program named Celsus to Kalvin should be "CelsusToKalvin".
	 * @param message the message you want to output.
	 * 
	 * @author xbony2
	 */
	public static void logError(String pre, String message){
		System.out.println("[" + pre + "][ERROR] " + message);
		
		File log = new File(directory);
	    try{
	    	if(!log.exists()){
	         	System.out.println("[" + Graveyard.name + "] New log created.");
	            log.createNewFile();
	    }
	    	
	    PrintWriter out = new PrintWriter(new FileWriter(log, true));
	    out.println("[" + pre + "][ERROR] " + message);
	    out.close();
	    }catch(IOException e){
	        System.out.println("[" + Graveyard.name + "][ERROR] Could not make file!");
	    }
	}
}
