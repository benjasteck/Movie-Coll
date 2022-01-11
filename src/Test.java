
import easv.dk.BE.Movie;
import easv.dk.DAL.MovieDAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        createMovie();
        //getAllMovie();
        //updateMovie();
        //deleteMovie();
        //System.out.println("?"+!connection.isClose());

    }



   private static void createMovie() throws Exception {
        MovieDAO movieDAO = new MovieDAO();

        List<Movie> movieList = new ArrayList<>();

       Movie movie1 = new Movie("The Matrix",4.5,5,"2022/01/11","url",0);
       Movie movie2 = new Movie("SpiderMan2",0,4.5,"2022-01-07","C://Movies/SpiderMan2.mp4",0);

         movieList.add(movie1);
       movieList.add(movie2);



        for (Movie myMovie: movieList) {
            System.out.println("movie name: "+myMovie.getTitle()+" Rating: "+myMovie.getImdbRating());
            movieDAO.createMovie(myMovie);
        }

    }
    /*private static void getAllMovie() {
        List<Movielist> listOfAllMovies = new ArrayList<>();
        try(Connection con = cm.getConnection()){
            String sqlSelectMovie= "SELECT * FROM Movie;";
            PreparedStatement pststmtmtselectMovie= con.prepareStatement(sqlSelectMovie);
            ResultSet rs= pststmtmtselectMovie.executeQuery();
            while (rs.next()){
                Movielist movielist = new Movielist(rs.getInt("id"),
                        rs.getString("Pname"));
                listOfAllMovies.add(movielist);
            }
        }
        return listOfAllMovies;
    }*/
}