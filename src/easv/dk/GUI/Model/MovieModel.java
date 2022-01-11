package easv.dk.GUI.Model;

import easv.dk.BE.Category;
import easv.dk.BE.Movie;
import easv.dk.BLL.Manager;
import javafx.collections.ObservableList;

public class MovieModel {

    public static ObservableList<Movie> getAllMovies() {
      //  return movieObservableList; // return the backend saver for songs
        return null;
    }

    public void deleteMovie(Movie selectedItem) {
        Manager.deleteMovie(selectedItem);
    }
}
