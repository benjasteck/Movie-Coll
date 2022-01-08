package easv.dk.gui.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;

public class MovieController {

    @FXML
    private Button btnCancelEditingMovie;

    @FXML
    private ComboBox comboBoxCategory;



    @FXML

    public void cancelEditingMovie(javafx.event.ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Discard changes ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();


        if (alert.getResult() == ButtonType.YES) {

            Stage stage = (Stage) btnCancelEditingMovie.getScene().getWindow();
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
