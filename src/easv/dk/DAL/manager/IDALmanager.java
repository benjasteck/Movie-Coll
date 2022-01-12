package easv.dk.dal.manager;

import easv.dk.BE.Category;
import easv.dk.BE.Movie;

import java.sql.SQLException;
import java.util.List;

public interface IDALmanager {
    public List<Movie> getAllMovies() throws SQLException;

    Movie createMovie(Movie movie) throws Exception;

    public List<Category>  getAllCategories() throws SQLException;

    public Category createCategory(String name);

    public static void deleteMovie(Movie movie) {

    }

    public static void deleteCategory(Category category) {

    }

    public List<Movie> getCategoriesFromMovies(Movie movie);

    public void updateMovie(String title, double userRating, double imbdRating, String lastView, String movieUrl, int id) throws SQLException;

    public void updateCategory(String name, int id) throws SQLException;
}
