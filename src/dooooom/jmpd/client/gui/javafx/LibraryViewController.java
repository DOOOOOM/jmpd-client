package dooooom.jmpd.client.gui.javafx;

import dooooom.jmpd.data.Track;
import dooooom.jmpd.data.TrackList;

import java.util.ArrayList;
import java.util.Map;

public class LibraryViewController {
    /*
	 * The actual library of tracks to choose from
	 */
    private TrackList library = new TrackList();

    /*
     * GUI Elements
     */

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
    private MainViewController mainViewController;
}