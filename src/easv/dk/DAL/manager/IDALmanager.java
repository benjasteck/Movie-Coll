package easv.dk.dal.manager;

import easv.dk.BE.Category;
import easv.dk.BE.Movie;

import java.sql.SQLException;
import java.util.List;

public interface IDALmanager {
    public List<Movie> getAllMovies() throws SQLException;

    Movie createMovie(Movie movie) throws Exception;

    public List<Category>  getAllCategories() throws SQLException;

    public Category createCategory(Category category) throws Exception;

    public void deleteMovie(Movie movie) throws SQLException;

    

    public void deleteCategory(Category category) throws SQLException;

    public List<Category> getCategoriesFromMovies(Category category);

    public List<Movie> getMoviesFromCategories(Movie movie);

    public void updateMovie(Movie movie) throws SQLException;

    public void updateCategory(String name, int id) throws SQLException;
}
