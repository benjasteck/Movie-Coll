package easv.dk.GUI.Controller;

import easv.dk.BE.Category;
import easv.dk.BE.Movie;
import easv.dk.GUI.Model.CategoryModel;
import easv.dk.GUI.Model.MovieModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    private CategoryModel categoryModel;
    private MovieModel movieModel;
    @FXML
    private TextField searchBar;
    private final ObservableList<Movie> dataList = FXCollections.observableArrayList();

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


    public Controller() {
        categoryModel = new CategoryModel();
        movieModel = new MovieModel();
    }

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


    public void closeApplication(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Close the Application ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {

            Stage stage = (Stage) btnCloseApplication.getScene().getWindow();
            stage.close();
        }
    }

    public void setUpMovieTable() {
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

    public void setUpCategoryTable() {
        TableColumn<Category, String> column1 = new TableColumn<>("Name");
        column1.setCellValueFactory(new PropertyValueFactory<>("name"));
        TableColumn<Category, String> column2 = new TableColumn<>("Total Movies");
        column2.setCellValueFactory(new PropertyValueFactory<>("movieCount"));

        categoryTable.getColumns().add(column1);
        categoryTable.getColumns().add(column2);

        // categoryTable.getItems().addAll(CategoryModel.getListCategory()); -> List in CategoryModel needs to be created first
    }

    public void filter() {

        dataList.addAll((Movie) MovieModel.getAllMovies()); //<-- depending on what name the method gets
        FilteredList<Movie> filteredData = new FilteredList<>(dataList, b -> true);

        searchBar.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(movie1 -> {
                // If filter text is empty, display all song.

                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }

                // Compare title, category and rating of every song with filter text.
                String lowerCaseFilter = newValue.toLowerCase();

                if (movie1.getTitle().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter title.
                }
                if (String.valueOf(movie1.getImdbRating()).contains(lowerCaseFilter)) {
                    for (int n = movie1.getImdbRating(); n <= 10; n++) {
                        return true; //filter minimum imdbRating
                    }
                }
                if (movie1.getCategory().toLowerCase().contains(lowerCaseFilter)) {
                    return true; // Filter category.
                } else return false;
                // if nothing found return false

            });
        });

        SortedList<Movie> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(movieTable.comparatorProperty());
        //show the new list of filtered songs
        movieTable.setItems(sortedData);

        //there needs to be a reference in an initialize method for this to work


    }


   public void sorter(){
        TableView<Movie> table = new TableView<>();
        TableColumn<Movie, String> column1 = new TableColumn<>("title");
                column1.setCellValueFactory(cellData -> cellData.getValue().NameProperty());
        TableColumn<Movie, String> column2 = new TableColumn<>("imbdRating");
                column2.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        TableColumn<Movie, String> column3 = new TableColumn<>("userRating");
                column3.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        TableColumn<Movie, String> column4 = new TableColumn<>("lastView");
               column4.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());



        ObservableList<Movie> data = FXCollections.observableArrayList();
        SortedList<Movie> sortedData = new SortedList<>(data);

// this ensures the sortedData is sorted according to the sort columns in the table:
        sortedData.comparatorProperty().bind(table.comparatorProperty());
    }


    public void openNewMovieWindow(ActionEvent actionEvent) throws IOException {

        // when "new.." button under Movies table is clicked, the movieWindow.fxml window will open//
               FXMLLoader loader = new FXMLLoader();
               loader.setLocation(getClass().getClassLoader().getResource("./GUI/View/movieWindow.fxml"));
               Parent root = loader.load();
              Stage stage = new Stage();
               stage.setTitle("New Movie");
               stage.setScene(new Scene(root));
               stage.show();
    }
}
