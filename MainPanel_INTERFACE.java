public interface MainView
{
	/**
	 * @Pre: the track should be a valid track with an id known to the database
	 * @Post: 
	 * 
	 * 	  everything updated with the info of this track:
	 * 		albumArtLabel
	 * 		currentTitleLabel
	 * 		songLengthLabel
	 */
	public void setTrack(Track track);
	
	/**
	 * @Pre: a track should be selected, with the length of the song known to the client
	 * @Post: the seek bar should be set to the position corresponding to the position set by the function. if the input is larger than the length of the song, set it to the end of the song
	 * 
	 * sets the seek bar to a specific position.  used to sync the client GUI with the daemon
	 */
	public void setSeek(int seconds);
	
	/**
	 * @Pre: mainPanel should not be null
	 * @Post: return the JPanel object that is currently occupying the main area of the GUI (library, play queue, etc)
	 */
	public JPanel getMainPanel();
}