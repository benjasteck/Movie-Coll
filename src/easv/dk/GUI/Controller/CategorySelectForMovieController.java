package easv.dk.GUI.Controller;

import easv.dk.BE.Category;
import easv.dk.BE.Movie;
import easv.dk.BLL.LogicInterface;
import easv.dk.BLL.Manager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class CategorySelectForMovieController {
    private Movie movie;
    private int selectedCategoryId;


    public int getSelectedCategoryId() {
        return selectedCategoryId;
    }

    public void setSelectedCategoryId(int selectedCategoryId) {
        this.selectedCategoryId = selectedCategoryId;
    }

    @FXML
    private Button CategorySelectFormMovieOkButton;

    @FXML
    private ComboBox<Category> categoryCombo;

    @FXML
    private Button categorySelectForMovieCancelButton;

    @FXML
    private Label movieIdLabel;

    @FXML
    private Label movieNameLabel;

    @FXML
    public void initialize() {
        movieIdLabel.setText(movie.getId() + "");
        movieNameLabel.setText(movie.getTitle());
        fillCategoryCombo();
    }

    private void fillCategoryCombo() {
        try {
            LogicInterface bll = new Manager();
            List<Category> movieCategories = bll.getCategoriesFromMovie(movie);  //get current movie category
            List<Category> allCategories = bll.getAllCategories();          //get all cateogries
            for (Category category : allCategories) {        //remove current movie categories from all categories
                if (movieCategories.contains(category))
                    allCategories.remove(category);
            }
                categoryCombo.getItems().clear();
            for (Category category:allCategories                 ) {
                categoryCombo.getItems().add(category);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
