package mx.arturogil.tableviewtest;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class AppController {
    @FXML private TableView<User> table;
    @FXML private TableColumn<User, String> usernameCol;
    @FXML private TableColumn<User, String> emailCol;
    @FXML private TableColumn<User, Boolean> isActiveCol;
    @FXML private Button addUserButton;

    @FXML
    public void handleAddUser() {
        User user = new User("aaaaa", "aaa@gmail.com", true);
        this.table.getItems().add(user);
    }

    @FXML
    public void initialize() {
        usernameCol.setCellValueFactory(new PropertyValueFactory<User, String>("username"));
        emailCol.setCellValueFactory(new PropertyValueFactory<User, String>("email"));
        isActiveCol.setCellValueFactory(new PropertyValueFactory<User, Boolean>("active"));

        isActiveCol.setCellFactory(col -> new TableCell<User, Boolean>() {
            @Override
            protected void updateItem(Boolean item, boolean empty) {
                super.updateItem(item, empty);
                this.setText(empty ? null : item ? "Yes" : "No");
            }
        });

        // Adds elements to table
        this.table.getItems().setAll(
                new User("agj96", "arturo.gil@gmail.com", true),
                new User("pp99", "peter.parker@gmail.com", true),
                new User("pp98", "pedro.paramo@gmail.com", false)
        );
    }
}