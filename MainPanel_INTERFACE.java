public interface MainView
{
	/*
	 * update everything with the info of this track:
	 * 	albumArtLabel
	 * 	currentTitleLabel
	 * 	songLengthLabel
	 */
	public void setTrack(Track track);
	
	/*
	 * sets the seek bar to a specific position.  used to sync the client GUI with the daemon
	 */
	public void setSeek(int seconds);
	
	/*
	 * return the JPanel object that is currently
	 * occupying the main area of the GUI (library, play queue, etc)
	 */
	public JPanel getMainPanel();
}