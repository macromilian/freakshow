package de.mkaminski.freakshow.view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 *Die View-Klasse erstellt die UI für das Programm
 *
 */
public class Menue {

        private Scene scene;
        private Button checkButton;
        private Button copyButton;
        private Label infoLabel;
        private TextField domainAddress;
        private Label domainAddressLabel;
        private TextArea result;
        private HBox hbox;
        private Stage stage;

        /**
         *
         *Konstruktor der Klasse View und ausschlaggebend für die UI:
         *
         */
        public Menue() {
                //Layout
                BorderPane pane = new BorderPane();

                //Top of Layout
                hbox = new HBox();
            hbox.setPadding(new Insets(15, 12, 15, 12));
            checkButton = new Button ("Überprüfen");
                domainAddressLabel = new Label("Domain: ");
                domainAddress = new TextField();
                domainAddress.setPrefColumnCount(27);
                domainAddress.setPromptText("Gebe den Domainnamen oder die IP-Addresse ein ");
                hbox.setSpacing(10);
                hbox.getChildren().addAll(domainAddressLabel, domainAddress, checkButton);
            pane.setTop(hbox);

            //Bottom of Layout
            hbox = new HBox();
            hbox.setPadding(new Insets(15, 12, 15, 12));
            copyButton = new Button("Kopieren");
            infoLabel = new Label("Info");
            hbox.setSpacing(380);
                hbox.getChildren().addAll(copyButton, infoLabel);

            pane.setBottom(hbox);

            //Center of Layout
            result = new TextArea();
            result.setEditable(false);
            result.setDisable(true);
            result.setMaxWidth(850);
            pane.setCenter(result);


            scene = new Scene(pane);
            checkButton.requestFocus();
        }

        /**
         *
         *Die Methode setzt einige wichitge Parameter fest und führt die Show()-methode der "Stage" aus.<br>
         *So wird die UI instanziiert.
         *
         */
        public void show(Stage stage) {
                  this.stage = stage;
                  this.stage.getIcons().add(new Image("http://whoisdl.com/img/logo/whoisdl_logo.png"));
                  this.stage.setTitle("Whois-Domain");
                  this.stage.setHeight(500);
                  this.stage.setWidth(500);
                  this.stage.setResizable(false);
                  this.stage.setScene(scene);
                  this.stage.show();
         }

        /**Getter für das Ausgabefeld*/
        public TextArea getResult() {
                return result;
        }

        /**Setter für das Ausgabefeld*/
        public void setResult(String result) {
                this.result.appendText(result);
        }

        /**Getter für den CheckButton*/
        public Button getCheckButton() {
                return checkButton;
        }

        /**Getter für den CopyButton*/
        public Button getCopyButton() {
                return copyButton;
        }

        /**Getter für das InfoLabel*/
        public Label getInfoLabel() {
                return infoLabel;
        }

        /**Getter für das Eingabefeld*/
        public TextField getDomainAddress() {
                return domainAddress;
        }
}
