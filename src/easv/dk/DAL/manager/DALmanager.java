package easv.dk.dal.manager;

import easv.dk.BE.Category;
import easv.dk.BE.Movie;
import easv.dk.DAL.CatMovieDAO;
import easv.dk.DAL.CategoryDAO;
import easv.dk.DAL.MovieDAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class DALmanager implements IDALmanager {
    private easv.dk.DAL.CategoryDAO categoryDAO;
    private easv.dk.DAL.MovieDAO movieDAO;
    private easv.dk.DAL.CatMovieDAO catMovieDAO;

    public DALmanager() throws IOException {
        this.categoryDAO = new CategoryDAO();
        this.movieDAO = new MovieDAO();
        this.catMovieDAO = new CatMovieDAO();
    }

    @Override
    public List<Movie> getAllMovies() throws SQLException {

        List<Movie> allMovies = movieDAO.getAllMovies();
        return allMovies;
    }

    @Override
    public Movie createMovie(Movie movie) throws Exception {
        return movieDAO.createMovie(movie);
    }

    @Override
    public List<Category> getAllCategories() throws SQLException {
        List<Category> allCategories = categoryDAO.getAllCategories();
        return allCategories;
    }



    public Category createCategory(Category category) throws Exception {
        return categoryDAO.createNewCategory(category);
    }


    @Override
    public List<Movie> getCategoriesFromMovies(Movie movie) {
        return catMovieDAO.getAllMoviesForGivenCategory();
    }

    @Override
    public void updateMovie(String title, double userRating, double imbdRating, String lastView, String movieUrl, int id) throws SQLException {

    }

    @Override
    public void updateCategory(String name, int id) throws SQLException {

    }
}
