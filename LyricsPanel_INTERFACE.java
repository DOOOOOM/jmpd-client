public interface LyricsPanel
{
	/**
	 * refetches lyrics
	 */
	public void refetch();
	
	/**
	 * sets the track that lyrics are being shown for.
	 * call refetch after setting to fetch lyrics
	 */
	public void setTrack(Track track);
}