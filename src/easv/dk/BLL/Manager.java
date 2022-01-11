package easv.dk.bll;


import easv.dk.BE.Category;
import easv.dk.BE.Movie;
import easv.dk.DAL.CatMovieDAO;
import easv.dk.DAL.CategoryDAO;
import easv.dk.DAL.MovieDAO;

import java.sql.SQLException;
import java.util.List;

public class Manager implements easv.dk.bll.LogicInterface {


    /*public List <Category> getAllCategories() throws bllException{}
    public List <Movie> getAllMovies() throws bllException{}
    public Movie createMovie (String title, int userRating, int imdbRating, String movieUrl, int id) throws bllException{}
    public Movie updateMovie (Movie movie, String title, int userRating, int imdbRating, String movieUrl, int id) throws bllException{}
    public Movie deleteMovie (){}
    public Movie updateMovieRating(){}
    public Movie updateMovieDate(){}
    public Category createCategory (String name) {}
    public Category updateCategory (String name){}
    public Category deleteCategory (){}
    public void addToCategory (){}
    public void removeToCategory(){}
    public void searchMovie (){}
    public void updateMovieRating(){}
    public void updateMovieDate(){}
    */

    public static void deleteCategory(Category selectedItem) {
      //  CategoryDAO.deleteCategory(selectedItem);
    }


    public List<Movie> getMoviesFromCategories(Category category) {
        return null;
    }

    @Override
    public void updateMovie(String title, double userRating, double imbdRating, String lastView, String movieUrl, int id) throws SQLException {

    }

    @Override
    public void updateCategory(String name, int id) throws SQLException {

    }


    public List<Movie> getAllMovies() throws SQLException {
        return null;
    }


    public Movie createMovie(Movie movie) throws SQLException {
        return null;
    }


    public List<Category> getAllCategories() {
        return null;
    }


    public Category createCategory(String name) {
        return null;
    }

    public static void deleteMovie(Movie selectedItem) {
      //  MovieDAO.deleteMovie(selectedItem);
    }
}
