package ibittech.graveyard.log;

import ibittech.graveyard.Graveyard;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * Used for logging console through the console, and makes a new file as well.
 * Use: on startup (before anything happens), use the deleteLog() method to delete
 * the old log so a new one can be made. Then, use setDirectory to set the directory
 * and name of the file (optional). After that, you should use setPrefix() to
 * set whatever you want your prefix to be (it's javadoc explains it nicely). Then
 * you should probably use log() is say you've just launched your program.
 * 
 * FIXME :JAVADOC IS OUTDATED
 * 
 * @author xbony2
 *
 */
public class GLog {
	/**
	 * Sets your prefix. This should be done on startup.
	 * 
	 * @param pref should be something like the name of your Program or an abbreviation, 
	 * without spaces, between 2-20 characters.
	 * For example, a Tic-Tac-Toe program could be "TicTacToe".
	 * A game named World Of Warcraft could be "WoW".
	 * A program named Celsus to Kalvin could be "CelsusToKalvin".
	 * 
	 * @author xbony2
	 */
	public GLog(String pref){
		if(isFirst){
			this.deleteLog();
			this.isFirst = false;
		}
		if(!pref.equals(null)){
			boolean isUsed = false;
			for(int i = 1; i >= names.size(); i++){
				if(names.get(i) == pref){
					System.out.println("[" + Graveyard.name + "][ERROR] Prefix name already in use!");
					isUsed = true;
					break;
				}
			}
			boolean isTooLongOrShort = false;
			if(pref.length() <= 2){
				isTooLongOrShort = true;
				System.out.println("[" + Graveyard.name + "][ERROR] Prefix name is too short! Attemped name: ");
				System.out.print(pref);
			}
			if(pref.length() >= 20){
				isTooLongOrShort = true;
				System.out.println("[" + Graveyard.name + "][ERROR] Prefix name is too long! Attemped name: ");
				System.out.print(pref);
			}
			if(!isUsed) prefix = "[" + pref + "]";
		}else{
			System.out.println("[" + Graveyard.name + "][ERROR] Prefix is null!");
		}
	}
	
	/**
	 * The prefix.
	 */
	private String prefix;
	
	/**
	 * List of reserved names
	 */
	private static List<String> names = Arrays.asList("Graveyard", "Java");
	
	/**
	 * True if the directory is already set.
	 */
	private static boolean isDirectorySet;
	
	/**
	 * True if this is the first prefix made
	 */
	private static boolean isFirst = true;
	
	/**
	 * The directory (and name) for the log file.
	 */
	private static String directory = "log";
	
	/**
	 * Sets the directory and name of the log file.
	 * 
	 * @param dir is the file's name and directory. On default, the log file is
	 * simply "log" which can also be called "src/log" If I wanted to generate
	 * the log file in this very package, I'd input "src/ibittech/graveyard/log/log.
	 * If I wanted it to have a different extension or name, I can change that 
	 * as well, ex: "src/ibittech/graveyard/log/logger.txt" will make a file
	 * named "logger.txt" in this very package.
	 * 
	 * @author xbony2
	 */
	public static void setDirectory(String dir){
		if(isDirectorySet){
			System.out.println("[" + Graveyard.name + "][ERROR] Log directory already set!");
		}else{
			if(!dir.equals(null)){
				directory = dir;
				isDirectorySet = true;
			}else{
				System.out.println("[" + Graveyard.name + "][ERROR] Directory String is null!");
			}
		}
	}
	
	/**
	 * Deletes the log automatically created by this class. Happens on startup.
	 */
	private static void deleteLog(){
		File log = new File(directory);
		
		if(!log.exists()){
			System.out.println("[" + Graveyard.name + "][ERROR] deleteLog was called, but no log exists!");
		}else{
			log.delete();
		}
	}
	
	/**
	 * @return number of used prefixes, always at least two (java + graveyard)
	 * 
	 * @author xbony2
	 */
	public static int getNumberOfUsedPrefixes(){
		return names.size();
	}
	
	/**
	 * To log ordinary messages, ex a startup phases.
	 * 
	 * @param message the message you want to output.
	 * 
	 * @author xbony2
	 */
	public void log(String message){
		if(message.equals(null)){
			System.out.println("[" + Graveyard.name + "][ERROR] Message is null! Caused by: " + this.prefix);
			return;
		}
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
	 * To log an error, like if a value isn't what it should be (Ex: Let's say
	 * a byte was used to represent who's turn it was in a chess game, 1 for
	 * the computer, 0 for the player, but the value was 2).
	 * 
	 * @param message the message you want to output.
	 * 
	 * @author xbony2
	 */
	public void logError(String message){
		if(message.equals(null)){
			System.out.println("[" + Graveyard.name + "][ERROR] Message is null! Caused by: " + this.prefix);
			return;
		}
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
}
