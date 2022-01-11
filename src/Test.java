
import easv.dk.BE.Movie;
import easv.dk.DAL.MovieDAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        //createMovie();
        getAllMovie();
        //updateMovie();
        //deleteMovie();
        //System.out.println("?"+!connection.isClose());

    }


    private static void createMovie() throws Exception {
        MovieDAO movieDAO = new MovieDAO();

        List<Movie> movieList = new ArrayList<>();

        Movie movie1 = new Movie("The Matrix", 4.5, 5, "2022/01/11", "url", 0);
        Movie movie2 = new Movie("SpiderMan2", 0, 4.5, "2022-01-07", "C://Movies/SpiderMan2.mp4", 0);

        movieList.add(movie1);
        movieList.add(movie2);


        for (Movie myMovie : movieList) {
            System.out.println("movie name: " + myMovie.getTitle() + " Rating: " + myMovie.getImdbRating());
            movieDAO.createMovie(myMovie);
        }

    }

    /*private static void getAllMovie() throws SQLException {
        List<Movie> movieList= new ArrayList<>();
        try(Connection con = cm.getConnection()){
            String sqlSelectMovie= "SELECT * FROM Movie;";
            PreparedStatement pststmtmtselectMovie= con.prepareStatement(sqlSelectMovie);
            ResultSet rs= pststmtmtselectMovie.executeQuery();
            while (rs.next()){
                Movie movielist = new Movie(id,name);
                        int id = rs.getInt(id);
                        String name= rs.getString(name);
                        //(rs.getInt("id"),
                        //rs.getString("name"));
                movieList.add(movielist);
            }
        }
        return movieList;*/
    public static void getAllMovie() throws SQLException, IOException {
        MovieDAO myAccessToMovieDatabase = new MovieDAO();
        List<Movie> lıstOfAllMovie = myAccessToMovieDatabase.getAllMovies();
        for (Movie movie : lıstOfAllMovie) {
            System.out.println("Movie name: " + movie.getTitle() + " rating: " + movie.getUserRating() + " category: " + movie.getCategory());
        }
    }
}