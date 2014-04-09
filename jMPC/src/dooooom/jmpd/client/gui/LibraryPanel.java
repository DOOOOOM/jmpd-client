package dooooom.jmpd.client.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
	 * The actual library of tracks to choose from
	 */
	private TrackList library = new TrackList();
	
	/*
	 *  GUI Elements
	 */
	private JList artistSelection;
	private JList albumSelection;
	private JList songSelection;
	
	/*
	 * ListModels for the GUI Elements
	 */
	private DefaultListModel<String> artistList = new DefaultListModel<>();
	private DefaultListModel<String> albumList = new DefaultListModel<>();
	private DefaultListModel<TrackJListItem> songList = new DefaultListModel<>();
	
	/*
	 * Current Selections (for filtering purposes)
	 */
	private String selectedArtist;
	private String selectedAlbum;
	
	/*
	 * HashMaps to track which artists created which albums, and which albums contain which tracks
	 */
	private Map<String, ArrayList<String>> artistAlbums;
	private Map<String, ArrayList<Track>> albumTracks;
	
	/*
	 * Track ID of the currently selected song
	 */
	private int currentTrackID;
	
	/*
	 * MainView that contains this LibraryPanel
	 */
	private MainView parentView;
	
	public LibraryPanel(MainView parent) {
		parentView = parent;
		
		this.setLayout(new GridBagLayout());
		
		addGUIElements();
		addJListFilterListeners();
	}
	
	/*
	 * Replaces the library and updates all lists
	 */
	public void setLibrary(TrackList tl) {
		library = tl;
		
		artistAlbums = new HashMap<String, ArrayList<String>>();
		albumTracks = new HashMap<String, ArrayList<Track>>();
		
		for (Track t : tl) {
			//add new arraylist if this artist has not been encountered before
			if (!artistAlbums.containsKey(t.get("artist")))
				artistAlbums.put(t.get("artist"), new ArrayList<String>());
			
			ArrayList<String> albums = artistAlbums.get(t.get("artist"));
			if(!albums.contains(t.get("album")))
				albums.add(t.get("album"));
			
			//repeat above code for album/titles
			if (!albumTracks.containsKey(t.get("album")))
				albumTracks.put(t.get("album"), new ArrayList<Track>());
			
			//add track to album listing
			albumTracks.get(t.get("album")).add(t);
		}
		
		updateJLists();
	}
	
	/*
	 * After changes have been made to the selection, update the JLists with the new filters
	 */
	private void updateJLists() {
		artistList = new DefaultListModel<>();
		albumList = new DefaultListModel<>();
		songList = new DefaultListModel<>();
		
		artistList.addElement("[any]");
		albumList.addElement("[any]");
		
		for (String s : artistAlbums.keySet()) {
			artistList.addElement(s);
		}
		
		if(selectedArtist == null || selectedArtist.isEmpty()) {
			//if no selected artist, add all albums
			for (String s : albumTracks.keySet())
				albumList.addElement(s);
		} else {
			//if there is a selected artist, filter albums
			for (String s : artistAlbums.get(selectedArtist))
				albumList.addElement(s);
		}
		
		TrackList availableTracks = (TrackList) (library.clone());
		
		//if there is an artist selected, filter the results
		if(selectedArtist != null && !selectedArtist.isEmpty()) {
			availableTracks = availableTracks.search("artist", selectedArtist);
		}
		
		//likewise for albums
		if(selectedAlbum != null && !selectedAlbum.isEmpty()) {
			availableTracks = availableTracks.search("album", selectedAlbum);
		}
		
		//add selected tracks to listmodel, wrapping in TrackJListItem objects
		for(Track t : availableTracks) {
			songList.addElement(new TrackJListItem(t));
		}
		
		//set the listmodels of the JList objects
		artistSelection.setModel(artistList);
		albumSelection.setModel(albumList);
		songSelection.setModel(songList);
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
	
	/*
	 * This method is separated to help with clutter in the main constructor
	 */
	private void addGUIElements() {
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
		this.add(new JScrollPane(artistSelection), c);
		
		c = new GridBagConstraints();
		albumSelection = new JList();
		c.gridx = 1;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		this.add(new JScrollPane(albumSelection), c);
		
		c = new GridBagConstraints();
		songSelection = new JList();
		c.gridx = 2;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		this.add(new JScrollPane(songSelection), c);
	}
	
	private void addJListFilterListeners() {
		
	}
	
	/*
	 * This class is used as a wrapper for a track, to be held in the JList.
	 * The reason for this is that the JList will display a toString of each item, and
	 * using this wrapper it will display only the track title.
	 */
	private class TrackJListItem {
		Track t;
		
		TrackJListItem(Track t) {
			this.t = t;
		}
		
		@Override
		public String toString() {
			return t.get("title");
		}
	}
}
