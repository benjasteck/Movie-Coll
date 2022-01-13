package easv.dk.DAL;

import easv.dk.BE.CatMovie;
import easv.dk.BE.Category;
import easv.dk.BE.Movie;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CatMovieDAO {
    ConnectionManager cm;

    public CatMovieDAO() {
        try {
            cm = new ConnectionManager();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createCategoryMovie(List<CatMovie> list){
        try (Connection con = cm.getConnection()) {

            String sql = "INSERT INTO catMovie (category_id, movie_id) VALUES (?,?)";
            PreparedStatement statement = con.prepareStatement(sql);

            for (CatMovie cM : list) {
                statement.setInt(1, cM.getCategoryID());
                statement.setInt(2, cM.getMovieID());
                statement.executeUpdate();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<CatMovie> getAllCatMovies() {

        ArrayList<CatMovie> catMovies = new ArrayList<>();
        try (Connection con = cm.getConnection()) {

            String sql = "SELECT * FROM catMovie;";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                int idCat = rs.getInt("category_id");
                int idMov = rs.getInt("movie_id");
                CatMovie catMovie = new CatMovie(idCat, idMov);
                catMovies.add(catMovie);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        for (CatMovie c: catMovies){
            System.out.println("Movie with id: "+c.getMovieID()+"  has category: " +c.getCategoryID() );
        }

        return catMovies;
    }


    public CatMovieDAO createIdMovie(CatMovieDAO catMovie) throws SQLException {
        CatMovieDAO createIdMovie = null;
        try (Connection con = cm.getConnection()) {
            String sqlSelectMovie = "";

        }
        return null;
    }

    public List<Movie> getMovieFromCategory(Category category) {
        List<Movie> movieList = new ArrayList<>();

        return movieList;
    }








    public void updateCatMovie(CatMovie catMovie) throws SQLException {
        try (Connection con = cm.getConnection()) {
            String sqlUpdateCatMovie = "UPDATE catMovie SET categotyId=?, movieId=?, WHERE ID=?;";
            PreparedStatement pststmtUpdateCatMovie = con.prepareStatement(sqlUpdateCatMovie, Statement.RETURN_GENERATED_KEYS);
            pststmtUpdateCatMovie.setInt(1, catMovie.getCategoryID());
            pststmtUpdateCatMovie.setDouble(2, catMovie.getMovieID());
            pststmtUpdateCatMovie.setInt(5, catMovie.getId());
            pststmtUpdateCatMovie.executeUpdate();
            //ResultSet rs = pststmtUpdateCatMovie.getGeneratedKeys();
        }
    }

    public void deleteCatMovie(CatMovie catMovie) throws SQLException {
        try (Connection con = cm.getConnection()) {
            String sqlDeleteCatMovie = "DELETE FROM catMovie WHERE ID=?;";
            PreparedStatement pststmtDeleteCatMovie = con.prepareStatement(sqlDeleteCatMovie, Statement.RETURN_GENERATED_KEYS);
            pststmtDeleteCatMovie.setInt(1, catMovie.getId());
            pststmtDeleteCatMovie.execute();
            //ResultSet rs = pststmtDeleteCatMovie.getGeneratedKeys();
        }
    }

    public List<Movie> getAllMoviesForGivenCategory() {
        return null;
    }

    public List<Category> getAllCategoriesForGivenMovie() {
        return null;
    }
}

