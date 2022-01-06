package easv.dk.gui.Controller;

import easv.dk.be.Category;
import easv.dk.be.Movie;
import easv.dk.gui.Model.CategoryModel;
import easv.dk.gui.Model.MovieModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private TableView categoryTable;
    @FXML
    private TableView movieTable;
    @FXML
    private Button btnNewCategory;
    @FXML
    private Button btnEditCategory;
    @FXML
    private Button btnDeleteCategory;
    @FXML
    private Button btnRemoveMovies;
    @FXML
    private Button btnAddMovies;
    @FXML
    private Button btnDeleteMovies;
    @FXML
    private Button btnEditMovies;
    @FXML
    private Button btnNewMovie;
    @FXML
    private Button btnCloseApplication;
    @FXML
    private Button btnRateMovie;
    @FXML
    private Button btnPlayMovie;

    public void newCategory(ActionEvent actionEvent) {
    }

    public void editCategory(ActionEvent actionEvent) {
    }

    public void deleteCategory(ActionEvent actionEvent) {
    }

    public void removeMovies(ActionEvent actionEvent) {
    }

    public void addMovies(ActionEvent actionEvent) {
    }

    public void deleteMovies(ActionEvent actionEvent) {
    }

    public void editMovies(ActionEvent actionEvent) {
    }

    public void newMovie(ActionEvent actionEvent) {
    }

    public void openRateMovieWindow(ActionEvent actionEvent) {
    }

    public void playMovie(ActionEvent actionEvent) {
    }

    public void closeApplication(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Close the Application ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {

            Stage stage = (Stage) btnCloseApplication.getScene().getWindow();
            stage.close();
        }
    }

    public void setUpMovieTable(){
        TableColumn<Movie, String> column1 = new TableColumn<>("Name");
        column1.setCellValueFactory(new PropertyValueFactory<>("title"));
        TableColumn<Movie, String> column2 = new TableColumn<>("IMBD Rating");
        column2.setCellValueFactory(new PropertyValueFactory<>("imbdRating"));
        TableColumn<Movie, String> column3 = new TableColumn<>("User Rating");
        column3.setCellValueFactory(new PropertyValueFactory<>("userRating"));
        TableColumn<Movie, String> column4 = new TableColumn<>("Last Viewed");
        column4.setCellValueFactory(new PropertyValueFactory<>("lastView"));

        movieTable.getColumns().add(column1);
        movieTable.getColumns().add(column2);
        movieTable.getColumns().add(column3);
        movieTable.getColumns().add(column4);

      //  movieTable.getItems().addAll(MovieModel.getListModel()); -> list in MovieModel needs to be created that it works

    }

    public void setUpCategoryTable(){
        TableColumn<Category, String> column1 = new TableColumn<>("Name");
        column1.setCellValueFactory(new PropertyValueFactory<>("name"));
        TableColumn<Category, String> column2 = new TableColumn<>("Total Movies");
        column2.setCellValueFactory(new PropertyValueFactory<>("movieCount"));

        categoryTable.getColumns().add(column1);
        categoryTable.getColumns().add(column2);

       // categoryTable.getItems().addAll(CategoryModel.getListCategory()); -> List in CategoryModel needs to be created first
    }

}
