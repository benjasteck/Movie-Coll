package easv.dk.GUI.Model;

import easv.dk.BE.Category;
import easv.dk.BE.Movie;

import easv.dk.BLL.Manager;
import easv.dk.DAL.manager.DALmanager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class MovieModel {

    private static Manager manager;



    ObservableList<Movie> getAllMovies;


    public MovieModel() throws IOException {
        this.manager = new Manager();
        getAllMovies = FXCollections.observableArrayList();
    }
    public void setGetAllMovies(ObservableList<Movie> getAllMovies) {
        this.getAllMovies = getAllMovies;
    }
    public static List<Movie> getAllMovies() throws SQLException {
      return manager.getAllMovies();
    }

    public void deleteMovie(Movie selectedItem) {
      //  Manager.deleteMovie(selectedItem);
    }
}
