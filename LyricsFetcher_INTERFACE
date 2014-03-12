import java.net.*;
import java.io.*;

/**
 * The LyricsFetcher is a tool that allows us to look for lyrics corresponding to a song,
 * given the song and artist name. This information will be manipulated to make an url that
 * will be tested for existence on a domain. If the lyrics are found they will be redirected
 * to the caller; if they are not an appropriate message will be returned. 
 * 
 * */

public interface LyricsFetcher 
{
	
	String domainURL = "http://www.azlyrics.com/lyrics/";
	/*
	 * The domainURL will be concatenated with a string from this class the make-up the URL to be accessed
	 */
	
	
	public String constructURL(String artistName, String songName);
	/**The constructURL method will manipulate the artistName and songName to mimic the format
	 * of URL that the azlyrics domain typically uses for its URLs and will append it to the 
	 * base URL (domainURL), the whole String being returned at the end.
	 * @Pre: the artistName and songName are available and are valid strings	 
	 * @Post: the string returned is a valid string
	 * */
	
	public String fetchLyrics(String completeURL);
	/** The fetchLyrics method, given an URL as argument, will open a buffered stream and read the html
	 * code on the page referred to by the URL. The code will then be parsed to extract the lyrics
	 * of the song as a String, that will be returned in the end. 
	 *  In the event that the page cannot be found a message ("No Lyrics found") will be displayed.
	 * @Pre: the URL provided is non empty
	 * @Post: a valid String is returned after execution of the method 
	 */
}
