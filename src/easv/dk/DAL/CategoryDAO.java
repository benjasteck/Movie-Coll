package easv.dk.DAL;

import easv.dk.BE.Category;
import easv.dk.BE.Movie;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO {
    easv.dk.DAL.ConnectionManager cm;

    public CategoryDAO() throws IOException {
        cm = new easv.dk.DAL.ConnectionManager();
    }

    private Category createNewCategory(Category category) throws Exception {
        Category creatCategory = null;
        try (Connection con = cm.getConnection()) {
            String sqlSelectCategory = "INSERT INTO category VALUES(?,?)";
            PreparedStatement pststmtInsertCategory = con.prepareStatement(sqlSelectCategory, Statement.RETURN_GENERATED_KEYS);
            pststmtInsertCategory.setInt(1, category.getId());
            pststmtInsertCategory.setString(2, category.getName());

            pststmtInsertCategory.execute();
            ResultSet rs = pststmtInsertCategory.getGeneratedKeys();
            while (rs.next()) {

                creatCategory = new Category(category.getId(),
                        category.getName(),
                        rs.getInt(1));


            }
            return creatCategory;
        }

    }

    public List<Category> getAllCategories() throws SQLException {
        List<Category> categoryList = new ArrayList<>();
        try (Connection con = cm.getConnection()) {
            String sqlSelectCategory = "SELECT * FROM category;";
            PreparedStatement pststmtmtselectCategory = con.prepareStatement(sqlSelectCategory);
            ResultSet rs = pststmtmtselectCategory.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                int Id = rs.getInt("Id");
                Category category = new Category(name, Id);
                categoryList.add(category);
            }
        }
        return categoryList;
    }

   /* public void updateCategory(Category category) throws SQLException {
        try (Connection con = cm.getConnection()) {
            String sqlUpdateCategory = "UPDATE category SET title=?, userRating=?,IMDBrating=?, filelink=?,lastview=? WHERE ID=?;";
            PreparedStatement pststmtUpdateCategory = con.prepareStatement(sqlUpdateCategory, Statement.RETURN_GENERATED_KEYS);
            pststmtUpdateCategory.setString(1, category.gettitle());
            pststmtUpdateCategory.setDouble(2, category.getuserRating);
            pststmtUpdateCategory.setDouble(2, category.getIMDBrating());
            pststmtUpdateCategory.setString(3, category.getMovieUrl());
            pststmtUpdateCategory.setString(4, category.getLastView());
            pststmtUpdateCategory.setInt(5, category.getId());
            pststmtUpdateCategory.executeUpdate();
            ResultSet rs = pststmtUpdateCategory.getGeneratedKeys();
        }*/


    public void deleteCategory(Category category) throws SQLException {
        try (Connection con = cm.getConnection()) {
            String sqlDeleteCategory = "DELETE FROM category WHERE ID=?;";
            PreparedStatement pststmtDeleteCategory = con.prepareStatement(sqlDeleteCategory, Statement.RETURN_GENERATED_KEYS);
            pststmtDeleteCategory.setInt(1, category.getId());
            pststmtDeleteCategory.execute();
            ResultSet rs = pststmtDeleteCategory.getGeneratedKeys();
        }
    }
}

