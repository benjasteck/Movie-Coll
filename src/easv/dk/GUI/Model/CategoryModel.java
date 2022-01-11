package easv.dk.GUI.Model;

import easv.dk.BE.Category;
import easv.dk.BLL.Manager;
import easv.dk.bll.Manager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CategoryModel {

    ObservableList<Category> getAllCategories;

    public CategoryModel() {
        getAllCategories = FXCollections.observableArrayList();
        setListCategory();
    }

    public static Object getAllCategories() {
        return null;
    }

    private void setListCategory() {
        //  getAllCategories.setAll(Manager.getAllCategories);
    }

    public ObservableList<Category> getGetAllCategories() {
        return getAllCategories;
    }

    public void setGetAllCategories(ObservableList<Category> getAllCategories) {
        this.getAllCategories = getAllCategories;
    }

    public void deleteCategory(Category selectedItem) {

        Manager.deleteCategory(selectedItem);
    }
}