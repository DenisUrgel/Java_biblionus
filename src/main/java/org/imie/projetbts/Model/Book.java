package org.imie.projetbts.Model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Book {
    public SimpleIntegerProperty id;
    public SimpleStringProperty title;
    public SimpleStringProperty imagePath;
    public SimpleIntegerProperty author_id;
    public int copiesAvailable;
    public SimpleStringProperty collectionName;
    public String createdAt;
    public String updatedAt;

    public Book(int book_id, String title, String image, int author_id, String collection) {
        this.id = new SimpleIntegerProperty(book_id);
        this.title = new SimpleStringProperty(title);
        this.author_id = new SimpleIntegerProperty(author_id);
        this.imagePath = new SimpleStringProperty(image);
        this.collectionName = new SimpleStringProperty(collection);

    }

    public IntegerProperty Book_idProperty() {
        return id;
    }

    public String getTitle() {
        return title.get();
    }
    public StringProperty titleProperty() {
        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public String getImagePath() {
        return getClass().getResource("/image/" + imagePath.get() + ".jpg").toExternalForm();

    }

    public void setImage(String image) {
        this.imagePath.set(image);
    }

    public IntegerProperty getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id.set(author_id);
    }

    public StringProperty getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName.set(collectionName);
    }
}
