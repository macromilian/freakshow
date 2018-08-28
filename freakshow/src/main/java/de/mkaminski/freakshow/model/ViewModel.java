package de.mkaminski.freakshow.model;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * Im rahmen des MVC-Paradigams speichert dieses ViewModel Informationen aus der
 * View (UI) f�r die Verarbeitung in der Businesslogik.
 *
 */
public class ViewModel{

        private TextField domainAddress;

        private TextArea result;

        private Label infoLabel;

        private Button copyButton;

        /**Getter f�r das InfoLabel*/
        public Label getInfoLabel() {
                return infoLabel;
        }

        /**Setter f�r das InfoLabel*/
        public void setInfoLabel(Label infoLabel) {
                this.infoLabel = infoLabel;
        }

        /**Getter f�r den CopyButton*/
        public Button getCopyButton() {
                return copyButton;
        }

        /**Getter f�r das Ausgabefeld*/
        public TextArea getResult() {
                return result;
        }

        /**Setter f�r das Ausgabefeld*/
        public void setResult(TextArea result) {
                this.result = result;
        }

        /**Getter f�r das Eingabefeld*/
        public TextField getDomainAddress() {
                return domainAddress;
        }

        /**Setter f�r das Eingabefeld*/
        public void setDomainAddress(TextField domainAddress) {
                this.domainAddress = domainAddress;
        }


}