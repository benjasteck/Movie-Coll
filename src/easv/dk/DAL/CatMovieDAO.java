package easv.dk.DAL;

import easv.dk.BE.Category;
import easv.dk.BE.Movie;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CatMovieDAO {
        easv.dk.DAL.ConnectionManager cm;
        public CatMovieDAO() {
            try {
                cm = new easv.dk.DAL.ConnectionManager();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public CatMovieDAO createIdMovie(CatMovieDAO catMovie) throws SQLException {
            CatMovieDAO createIdMovie= null;
            try (Connection con = cm.getConnection()){
                String sqlSelectMovie = "";

            }
            return null;
        }

    public List<Movie> getAllMoviesForGivenCategory(){
        return null;
    }

    public List<Category> getAllCategoriesForGivenMovie(){
        return null;
    }

    public void addMovieToCategory(){

    }

    public void removeMovieFromCategory(){

    }
    }

