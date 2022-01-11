package easv.dk.BE;

import java.util.List;

public class Category {
    private String name;
    private int movieCount = 0;
    private List<Movie> moviesInCategory;
    private int Id;

    public Category(int Id, String name, int movieCount, List<Movie> moviesInCategory) {
        this.name = name;
        this.movieCount = movieCount;
        this.moviesInCategory = moviesInCategory;
        this.Id = Id;
    }

    public Category(int id, String name, int anInt) {
    }

    public Category(String name, int id) {
    }


    public String getName() {
        return name;
    }

    public int getMovieCount() {
        return movieCount;
    }

    public List<Movie> getMoviesInCategory() {
        return moviesInCategory;
    }

    public int getId() {
        return Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMovieCount(int movieCount) {
        this.movieCount = movieCount;
    }

    public void setMoviesInCategory(List<Movie> moviesInCategory) {
        this.moviesInCategory = moviesInCategory;
    }


}