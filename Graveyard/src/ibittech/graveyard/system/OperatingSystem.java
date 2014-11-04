package ibittech.graveyard.system;

public enum OperatingSystem {
	WINDOWS,
	OSX,
	LINUX,
	SOLARIS,
	OTHER;
	
	public static OperatingSystem getOs(){
		String os = System.getProperty("os.name").toLowerCase();
		if(os.contains("win")) return WINDOWS;
		if(os.contains("mac")) return OSX;
		if(os.contains("linux") || os.contains("unix")) return LINUX;
		if(os.contains("solaris") || os.contains("sunos")) return SOLARIS;	
		return OTHER;
	}
}
