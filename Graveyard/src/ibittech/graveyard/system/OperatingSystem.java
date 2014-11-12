package ibittech.graveyard.system;

/**
 * Used for common operationing systems stuff.
 * 
 * @author xbony2
 *
 */
public enum OperatingSystem {
	WINDOWS,
	OSX,
	LINUX,
	SOLARIS,
	OTHER;
	
	/**
	 * Gets the operating system
	 * 
	 * @return the operating system (the enum)
	 * 
	 * @author xbony2
	 */
	public static OperatingSystem getOs(){
		String os = System.getProperty("os.name").toLowerCase();
		if(os.contains("win")) return WINDOWS;
		if(os.contains("mac")) return OSX;
		if(os.contains("linux") || os.contains("unix")) return LINUX;
		if(os.contains("solaris") || os.contains("sunos")) return SOLARIS;	
		return OTHER;
	}
}
