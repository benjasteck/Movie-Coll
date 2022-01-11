package easv.dk.DAL;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class CatMovieDAO {
        ConnectionManager cm;
        public CatMovieDAO() {
            try {
                cm = new ConnectionManager();

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
    }

