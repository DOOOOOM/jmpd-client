package dooooom.jmpd.client.gui;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.sound.midi.Track;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSlider;


public class MainView {
	private JMenuBar mainMenu;
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
	
	JFrame mainFrame = new JFrame();

	public MainView() {
		mainFrame.setLayout(new GridBagLayout());
		
		GridBagConstraints c;
		
		c = new GridBagConstraints();
		mainMenu = new JMenuBar();
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 4;
		c.anchor = GridBagConstraints.LINE_START;
		c.weightx = 1;
		c.weighty = 0;
		mainFrame.add(mainMenu, c);
		
		c = new GridBagConstraints();
		prevButton = new JButton("|<");
		c.gridx = 0;
		c.gridy = 1;
		c.gridheight = 2;
		c.weightx = 0;
		c.weighty = 0;
		mainFrame.add(prevButton, c);
		
		c = new GridBagConstraints();
		playPauseButton = new JButton("|>");
		c.gridx = 1;
		c.gridy = 1;
		c.gridheight = 2;
		c.weightx = 0;
		c.weighty = 0;
		mainFrame.add(playPauseButton, c);
		
		c = new GridBagConstraints();
		nextButton = new JButton(">|");
		c.gridx = 2;
		c.gridy = 1;
		c.gridheight = 2;
		c.weightx = 0;
		c.weighty = 0;
		mainFrame.add(nextButton, c);
		
		c = new GridBagConstraints();
		currentTitleLabel = new JLabel("Title - Artist - Album (Year)");
		c.gridx = 3;
		c.gridy = 1;
		c.weightx = 1;
		c.weighty = 0;
		mainFrame.add(currentTitleLabel, c);
		
		c = new GridBagConstraints();
		seekSlider = new JSlider();
		c.gridx = 3;
		c.gridy = 2;
		c.weightx = 1;
		c.weighty = 0;
		mainFrame.add(seekSlider, c);
		
		c = new GridBagConstraints();
		seekSlider = new JSlider();
		c.gridx = 3;
		c.gridy = 2;
		c.weightx = 1;
		c.weighty = 0;
		mainFrame.add(seekSlider, c);
		
		mainMenu.add(new JMenu("File"));
		mainMenu.add(new JMenu("Daemon"));
		mainMenu.add(new JMenu("Client"));
		mainMenu.add(new JMenu("Help"));
		
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	
	/*
	 * update everything with the info of this track:
	 * 	albumArtLabel
	 * 	currentTitleLabel
	 * 	songLengthLabel
	 */
	public void setTrack(Track track) {
		
	}
	public void setSeek(int seconds) {
		
	}
	public JPanel getMainPanel() {
		return mainPanel;
	}
}
