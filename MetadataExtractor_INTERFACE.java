import mp3agic.*;

/**
 * This class will carry out operations to extract diverse information from
 * the ID3 tag of a specified mp3 file. It will use functionalities from
 * the mp3agic package.
 *  
 * */


public interface MetadataExtractor 
{
	String extractArtistFrom(Mp3File m);
	/* The extractArtistFrom method checks the ID3 version of the mp3 file and 
	 * extracts the artist's name from the MP3 file.
	 * 
	 */
	
	String extractTitleFrom(Mp3File m);
	/* The extractNameFrom method checks the ID3 version of the mp3 file and 
	 * extracts the song title from the MP3 file.
	 * 
	 */
	
	String extractAlbumFrom(Mp3File m)
	/* The extractAlbumFrom method checks the ID3 version of the mp3 file and 
	 * extracts the artist's name from the MP3 file.
	 * 
	 */
}
