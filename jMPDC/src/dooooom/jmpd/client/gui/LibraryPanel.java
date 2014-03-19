package dooooom.jmpd.client.gui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class LibraryPanel extends JPanel {
	private static final long serialVersionUID = -8684560904793974034L;
	
	JList artistSelection;
	JList albumSelection;
	JList songSelection;
	
	public LibraryPanel() {
		this.setLayout(new GridBagLayout());
		
		GridBagConstraints c;
		
		String artistListData[] = { "Artist 1", "Artist 2", "Artist 3", "Artist 4",
				"Artist 5", "Artist 6", "Artist 7", "Artist 8",
				 "Artist 1", "Artist 2", "Artist 3", "Artist 4",
					"Artist 5", "Artist 6", "Artist 7", "Artist 8"};
		String albumListData[] = { "Album 1", "Album 2", "Album 3", "Album 4",
				"Album 5", "Album 6", "Album 7", "Album 8",
				 "Album 1", "Album 2", "Album 3", "Album 4",
					"Album 5", "Album 6", "Album 7", "Album 8"};
		String songListData[] = { "Song 1", "Song 2", "Song 3", "Song 4",
				"Song 5", "Song 6", "Song 7", "Song 8",
				 "Song 1", "Song 2", "Song 3", "Song 4",
					"Song 5", "Song 6", "Song 7", "Song 8"};
		
		c = new GridBagConstraints();
		artistSelection = new JList(artistListData);
		artistSelection.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		artistSelection.setLayoutOrientation(JList.VERTICAL);
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		this.add(new JScrollPane(artistSelection), c);
		
		c = new GridBagConstraints();
		albumSelection = new JList(albumListData);
		c.gridx = 1;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		this.add(new JScrollPane(albumSelection), c);
		
		c = new GridBagConstraints();
		songSelection = new JList(songListData);
		c.gridx = 2;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		this.add(new JScrollPane(songSelection), c);
	}
}
