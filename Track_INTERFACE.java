public interface Track
{
	/**
	 * returns the unique ID of the track
	 */
	public int getID();
	
	/*
	 * these return the metadata of the track as defined in the database specification
	 * if there is no data available, return an "unknown" value
	 */
	public String getTitle();
	public String getArtist();
	public String getAlbum();
	public String getYear();
	public int getTrack();
	public int getTotalTracks();
	public int getLength();
	public String getAlbumArt();
	
	/**
	 * used to get metadata for a field not previously defined.
	 * For the purpose of enabling later expansion
	 */
	public String getOther(String key);
}