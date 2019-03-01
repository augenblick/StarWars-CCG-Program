package DoesNotCompile;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CardListView extends Application {

    private TableView cardTable = new TableView();
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage){
        
        String cardSetName = "Test Set";
        Scene scene = new Scene(new Group());
        stage.setTitle("SWCCG Viewer");
        stage.setWidth(950);
        stage.setHeight(500);

        Label cardSetNameLabel = new Label(cardSetName);
        cardSetNameLabel.setFont(new Font("Arial", 20));

        cardTable.setEditable(true);

        TableColumn cardNameCol = new TableColumn("Name");
        TableColumn cardTypeCol = new TableColumn("Type");
        TableColumn cardSideCol = new TableColumn("Side");
        TableColumn cardSetCol  = new TableColumn("Set");

        TableColumn cardTypeMainCol = new TableColumn("Main");
        TableColumn cardTypeSubCol  = new TableColumn("Sub");

        cardTypeCol.getColumns().addAll(cardTypeMainCol, cardTypeSubCol);

        cardTable.getColumns().addAll(cardNameCol, cardTypeCol, cardSideCol, cardSetCol);
        VBox centerPanel = new VBox();
        centerPanel.setSpacing(5);
        centerPanel.setPadding(new Insets(10, 0, 0, 10));
        centerPanel.getChildren().addAll(cardSetNameLabel, cardTable);

        ((Group) scene.getRoot()).getChildren().addAll(centerPanel);

        stage.setScene(scene);
        stage.show();

    }

}