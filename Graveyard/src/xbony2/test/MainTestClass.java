package xbony2.test;

import ibittech.graveyard.log.GLog;
import ibittech.graveyard.system.OperatingSystem;

/**
 * This class is created to test the graveyard
 * library, it is not an extension of it and should not
 * be distributed alongside it.
 * 
 * @author xbony2
 *
 */
public class MainTestClass {
	public static GLog log;

	public static void main(String[] args){
		GLog.setDirectory("files/log.txt");
		log = new GLog("Test");
		log.log("Start up!");
		log.log("I hope this is working fine!");
		System.out.println(OperatingSystem.getOs());
		System.out.println(System.getProperty("os.name"));
	}
}
