package easv.dk.bll;

import easv.dk.BE.Category;
import easv.dk.BE.Movie;

import java.sql.SQLException;
import java.util.List;

public interface LogicInterface {

public List<Movie> getAllMovies() throws SQLException;

    Movie createMovie(Movie movie) throws SQLException;

    public List<Category>  getAllCategories();

    public Category createCategory(String name);

    public static void deleteMovie(Movie movie) {

    }

    public static void deleteCategory(Category category) {

    }

    public List<Movie> getMoviesFromCategories(Category category);

    public void updateMovie(String title, double userRating, double imbdRating, String lastView, String movieUrl, int id) throws SQLException;
    public void updateCategory(String name, int id) throws SQLException;



}
