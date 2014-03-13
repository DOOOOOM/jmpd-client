/**
 * This class will carry out operations to help discover song
 * files in the user's music directory.
 */

import java.lang.*;
import java.io.File;

public interface FileSystemScanner
{
	String osName = System.getProperty("os.name").toLowerCase();
	String userName = System.getProperty("user.name");
	/*
	 * The osName variable will be assigned the value of a String
	 * that corresponds to the OS designation
	 */
	
	
	String windows7MusicFolderName = "C:\\Users\\" + userName + "\\Music";
	String windows8MusicFolederName = windows7MusicFolderName;
	String windowsVistaMusicFolderName = windows7MusicFolderName;
	String windowsXPMusicFolderName = "C:\\Documents and Settings\\" + userName + "\\My Documents\\My Music";
	String linuxMusicFolderName = "/home/" + userName.toLowerCase() + "Music";
	String solarisMusicFolderName = linuxMusicFolderName;
	String macMusicFolderName = "/Users/" + userName.toLowerCase() + "/Music";

	/**
	 * We initialize constants that correspond to the default location of the 
	 * Music library on different systems
	 */
	
	String[] returnPathNames();
	/**
	 * This method provided with the default music directory for the system,
	 * will return an array of Strings, each corresponding to the pathName
	 * of the file in question. Directories will not be returned
	 * @ Pre: the musicFolderPath is a valid String
	 * @ Pre: the musicFolderPath is a valid directory path
	 * @ Post: None of the paths returned by the method are folders
	 * return transition
	 * 
	 * 
	 */	
}
