package easv.dk.DAL.manager;

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

    public static void deleteCategory(Object selectedItem) {
    }

    @Override
    public List<Movie> getAllMovies() throws SQLException {

        return movieDAO.getAllMovies();
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
    public List<Movie> getMoviesFromCategories(Movie movie) {
        return catMovieDAO.getAllMoviesForGivenCategory();
    }

    @Override
    public List<Category> getCategoriesFromMovies(Category category) {
        return catMovieDAO.getAllCategoriesForGivenMovie();
    }

    @Override
    public void updateMovie(Movie movie) throws SQLException {
       movieDAO.updateMovie(movie);
    }

    @Override
    public void updateCategory(String name, int id) throws SQLException {

    }


    public void updateCategory(Category category) throws SQLException {
         //categoryDAO.updateCategory(category);
    }

    public void deleteCategory(Category category) throws SQLException {
        categoryDAO.deleteCategory(category);
    }

    public void deleteMovie(Movie movie) throws SQLException {
        movieDAO.deleteMovie(movie);
    }

    public void addMovieToCategory(){

    }

    public void removeMovieFromCategory(){

    }
}
