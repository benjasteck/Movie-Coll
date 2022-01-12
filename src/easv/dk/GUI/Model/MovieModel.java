package easv.dk.GUI.Model;

import easv.dk.BE.Category;
import easv.dk.BE.Movie;

import easv.dk.BLL.Manager;
import easv.dk.DAL.manager.DALmanager;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class MovieModel {

    private static Manager manager;



    public MovieModel() throws IOException {
        this.manager = new Manager();
    }

    public static List<Movie> getAllMovies1() throws SQLException {
      return manager.getAllMovies();
    }

    public void deleteMovie(Movie selectedItem) {
      //  Manager.deleteMovie(selectedItem);
    }
}
