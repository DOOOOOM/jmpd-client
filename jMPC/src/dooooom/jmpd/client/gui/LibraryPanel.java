package dooooom.jmpd.client.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import dooooom.jmpd.data.Track;
import dooooom.jmpd.data.TrackList;

public class LibraryPanel extends JPanel {
	private static final long serialVersionUID = -8684560904793974034L;
	
	/*
	 *  GUI Elements
	 */
	JList artistSelection;
	JList albumSelection;
	JList songSelection;
	
	TrackList library = new TrackList();
	TrackList visible = new TrackList();
	
	DefaultListModel<String> artistList = new DefaultListModel<>();
	DefaultListModel<String> albumList = new DefaultListModel<>();
	DefaultListModel<String> songList = new DefaultListModel<>();
	
	public LibraryPanel() {
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints c;
		
		c = new GridBagConstraints();
		artistSelection = new JList();
		artistSelection.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		artistSelection.setLayoutOrientation(JList.VERTICAL);
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		this.add(new JScrollPane(), c);
		
		c = new GridBagConstraints();
		albumSelection = new JList();
		c.gridx = 1;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		this.add(new JScrollPane(), c);
		
		c = new GridBagConstraints();
		songSelection = new JList();
		c.gridx = 2;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		this.add(new JScrollPane(songSelection), c);
	}
	
	private void addToLibrary(TrackList tl) {
		
	}
	
	private void addToLibrary(Track t) {
		
	}
	
	private void updateJLists() {
		artistList = new DefaultListModel<>();
		albumList = new DefaultListModel<>();
		songList = new DefaultListModel<>();
		
		
	}
	
	private void addElementFromTrack(DefaultListModel<String> d, Track t, String key, String defaultValue) {
		String value = t.get(key);
		if(value == null)
			value = defaultValue;
		
		d.addElement(value);
	}
	
	private void addElementFromTrack(DefaultListModel<String> d, Track t, String key) {
		addElementFromTrack(d, t, key, "Unknown");
	}
}
