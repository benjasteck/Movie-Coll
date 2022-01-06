package easv.dk.gui.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Controller {

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

}
