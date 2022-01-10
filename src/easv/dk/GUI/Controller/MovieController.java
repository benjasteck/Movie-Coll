package easv.dk.GUI.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

public class MovieController {

    @FXML
    public Button cancelEditingMovie;

    @FXML
    private ComboBox comboBoxCategory;



   @FXML
    public void cancelEditingMovie(ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Discard changes ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();


        if (alert.getResult() == ButtonType.YES) {

           Stage stage = (Stage) cancelEditingMovie.getScene().getWindow();
           stage.close();
        }
    }

    // @Override
    //    public void initialize(URL location, ResourceBundle resources) {
    //        try {
    //            comboBoxCategory.setItems(MovieModel.getAllCategories());
    //
    //        } catch (CategoryMovieDAOException e) {
    //            e.printStackTrace();
    //        }
}
