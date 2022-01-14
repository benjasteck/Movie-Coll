package easv.dk.GUI.Model;

import easv.dk.BE.Category;
import easv.dk.BE.Movie;

import easv.dk.bll.Manager;
import easv.dk.dal.manager.DALmanager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class MovieModel {





    ObservableList<Movie> getAllMovies;


    public MovieModel() throws IOException {

        getAllMovies = FXCollections.observableArrayList();
    }
    Manager manager = new Manager();
    public void setGetAllMovies(ObservableList<Movie> getAllMovies) {
        this.getAllMovies = getAllMovies;
    }
    public List<Movie> getAllMovies1() throws SQLException, IOException {

        this.getAllMovies = FXCollections.observableArrayList();
        this.getAllMovies.addAll(this.manager.getAllMovies());
        return this.getAllMovies;
    }

    public void deleteMovie(Movie selectedItem) {
      //  Manager.deleteMovie(selectedItem);
    }
}
