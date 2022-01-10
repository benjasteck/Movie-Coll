package easv.dk.DAL;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import easv.dk.BE.Movie;


public class MovieDAO {

   /* ConnectionManager cm;
    public MovieDAO() throws IOException {
        cm = new ConnectionManager();
    }
    //Insert values to the movie table.
    public Movie createMovie(Movie movie) throws Exception {
        Movie movieCreated=null;
        try(Connection con = cm.getConnection()){
            String sqlSelectMovie = "INSERT INTO MOVIE VALUES(?,?,?,?,?)";
            PreparedStatement pststmtInsertMovie = con.prepareStatement(sqlSelectMovie, Statement.RETURN_GENERATED_KEYS);

            pststmtInsertMovie.setString(1,movie.getTitle());
            pststmtInsertMovie.setInt(2,movie.getImdbRating());
            pststmtInsertMovie.setString(3,movie.getMovieUrl());
            pststmtInsertMovie.setDate(4, (Date) movie.getLastView());
            pststmtInsertMovie.execute();
            ResultSet rs = pststmtInsertMovie.getGeneratedKeys();
            while(rs.next()){
                movieCreated = new Movie(movie.getTitle(),
                        rs.getInt(1),
                        movie.getImdbRating(),
                        movie.getLastView(),
                        movie.getMovieUrl(),
                        movie.getUserRating());

            }
            return movieCreated;
        }
    }
    public List<Movie> getAllMovies () throws SQLException {
        List<Movie> movieList = new ArrayList<>();
        try(Connection con= cm.getConnection()) {
            String sqlSelectMovie= "SELECT * FROM Movie;";
            PreparedStatement pststmtmtselectMovie = con.prepareStatement(sqlSelectMovie);
            ResultSet rs = pststmtmtselectMovie.executeQuery();

            while (rs.next()){
                Movie movie = new Movie(rs.getString("id"),
                        rs.getString("title"),
                        rs.getString("rating"),
                        rs.getString("filelink"),
                        rs.getString("lastview"));

                movieList.add(movie);
            }
        }
        return movieList;
    }
    public void updateMovie(Movie movie) throws SQLException {
        try(Connection con= cm.getConnection()){
            String sqlUpdateMovie= "UPDATE Movie SET title=?, rating=?, filelink=?,lastview=? WHERE ID=?;";
            PreparedStatement pststmtUpdateMovie= con.prepareStatement(sqlUpdateMovie,Statement.RETURN_GENERATED_KEYS);
            pststmtUpdateMovie.setString(1,movie.getTitle());
            pststmtUpdateMovie.setInt(2,movie.getImdbRating());
            pststmtUpdateMovie.setString(3,movie.getMovieUrl());
            pststmtUpdateMovie.setDate(4, (Date) movie.getLastView());
            pststmtUpdateMovie.setInt(5,movie.getId());
            pststmtUpdateMovie.executeUpdate();
            ResultSet rs = pststmtUpdateMovie.getGeneratedKeys();
        }
    }
    public void deleteMovie(Movie movie) throws SQLException {
        try(Connection con = cm.getConnection()){
            String sqlDeleteMovie= "DELETE FROM movie WHERE ID=?;";
            PreparedStatement pststmtDeleteMovie= con.prepareStatement(sqlDeleteMovie,Statement.RETURN_GENERATED_KEYS);
            pststmtDeleteMovie.setInt(1,movie.getId());
            pststmtDeleteMovie.execute();
            //  ResultSet rs = pststmtDeleteMovie.getGeneratedKeys();
        }


    }
*/
}