package dooooom.jmpd.client.gui.javafx;

import dooooom.jmpd.data.Track;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {
    private LibraryViewController libraryViewController;

    @FXML private ListView<String> artist_list_view;
    @FXML private ListView<String> album_list_view;
    @FXML private ListView<Track> track_list_view;

    @Override
    public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
        libraryViewController = new LibraryViewController();
    }
}
