package easv.dk.BLL;


import easv.dk.BE.Category;
import easv.dk.BE.Movie;
import easv.dk.DAL.CatMovieDAO;
import easv.dk.DAL.CategoryDAO;
import easv.dk.DAL.MovieDAO;
import easv.dk.DAL.manager.DALmanager;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Manager implements easv.dk.bll.LogicInterface {

   private DALmanager daLmanager;

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

    public Manager() throws IOException {
        this.daLmanager = new DALmanager();
    }



    @Override
    public List<Movie> getAllMovies() throws SQLException {

       // return daLmanager.getAllMovies();
        return null;
    }

    @Override
    public Movie createMovie(Movie movie) throws Exception {
       // return daLmanager.createMovie(movie);
        return null;
    }

    @Override
    public List<Category> getAllCategories() throws SQLException {
       // List<Category> allCategories = daLmanager.getAllCategories();
        //return allCategories;
        return null;
    }



    public Category createCategory(Category category) throws Exception {
        //return daLmanager.createCategory(category);
        return null;
    }


    @Override
    public List<Movie> getMoviesFromCategories(Movie movie) {
        return daLmanager.getMoviesFromCategories(movie);
    }

    @Override
    public List<Category> getCategoriesFromMovies(Category category) {
   //     return daLmanager.getCategoriesFromMovies(category);
        return null;
    }

    @Override
    public void updateMovie(Movie movie) throws SQLException {
        //daLmanager.updateMovie(movie);
    }

    @Override
    public void updateCategory(String name, int id) throws SQLException {

    }


    public void updateCategory(Category category) throws SQLException {
        //categoryDAO.updateCategory(category);
    }

    public static void deleteCategory(Object selectedItem) throws SQLException{
        DALmanager.deleteCategory(selectedItem);

    }
    public void deleteMovie(Movie movie) throws SQLException {
        daLmanager.deleteMovie(movie);
    }

    public void addMovieToCategory(){

    }

    public void removeMovieFromCategory(){

    }

}
