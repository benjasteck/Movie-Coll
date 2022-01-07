package easv.dk.be;

import java.util.Date;

public class Movie{
        private String title;
        private int userRating;
        private int imdbRating;
        private String movieUrl;
        private Date lastView;
        private int Id;
        private int he;
        private String Category;

        public Movie(String title, int userRating, int imdbRating, Date lastView, String movieUrl, int Id) {
                this.title = title;
                this.userRating = userRating;
                this.imdbRating = imdbRating;
                this.lastView = lastView;
                this.movieUrl = movieUrl;
                this.Id = Id;
        }

        public int getId() {
                return Id;
        }

        public String getTitle() {
                return title;
        }

        public int getUserRating() {return userRating;}

        public int getImdbRating() {
                return imdbRating;
        }

        public Date getLastView() {
                return lastView;
        }

        public String getMovieUrl() {
                return movieUrl;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public void setUserRating(int userRating) {
                this.userRating = userRating;
        }

        public void setImdbRating(int imdbRating) {
                this.imdbRating = imdbRating;
        }

        public void setMovieUrl(String movieUrl) {
                this. movieUrl =  movieUrl;
        }

        public void setLastView(Date lastView) {
                this.lastView = lastView;
        }

        public String getCategory() {return Category;}
}
