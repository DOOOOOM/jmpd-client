/**
 * ArtExtractor retrieves album art from audio files
 * to be displayed by the client's GUI.
 */

public interface ArtExtractor {
	// constructor
	public ArtExtractor();

	// fetches the music folder path from the variable
	// set by the client
	public String getMusicFolderPath();

	// fetches the file path from the daemon
	public String getSongFilePath(Song id);

	// pulls the art from the file, and stores
	// it somewhere in the heap.
	public int extractArt(String filepath);
}
