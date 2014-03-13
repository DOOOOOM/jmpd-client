public interface MainView
{
	private JMenuBar menuBar;
	private JButton prevButton;
	private JButton nextButton;
	private JButton playPauseButton;
	private JLabel currentTitleLabel;
	private JSlider seekSlider;
	private JLabel currentSeekLabel;
	private JLabel songLengthLabel;
	private JComboBox paneSelectorComboBox;
	private JComboBox playlistComboBox;
	private JLabel albumArtLabel;
	private JPanel mainPanel;
	
	/*
	 * update everything with the info of this track:
	 * 	albumArtLabel
	 * 	currentTitleLabel
	 * 	songLengthLabel
	 */
	public void setTrack(Track track);
	public void setSeek(int seconds);
	public JPanel getMainPanel();
}