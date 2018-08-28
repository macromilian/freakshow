package de.mkaminski.freakshow.model;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * Im rahmen des MVC-Paradigams speichert dieses ViewModel Informationen aus der
 * View (UI) für die Verarbeitung in der Businesslogik.
 *
 */
public class ViewModel{

        private TextField domainAddress;

        private TextArea result;

        private Label infoLabel;

        private Button copyButton;

        /**Getter für das InfoLabel*/
        public Label getInfoLabel() {
                return infoLabel;
        }

        /**Setter für das InfoLabel*/
        public void setInfoLabel(Label infoLabel) {
                this.infoLabel = infoLabel;
        }

        /**Getter für den CopyButton*/
        public Button getCopyButton() {
                return copyButton;
        }

        /**Getter für das Ausgabefeld*/
        public TextArea getResult() {
                return result;
        }

        /**Setter für das Ausgabefeld*/
        public void setResult(TextArea result) {
                this.result = result;
        }

        /**Getter für das Eingabefeld*/
        public TextField getDomainAddress() {
                return domainAddress;
        }

        /**Setter für das Eingabefeld*/
        public void setDomainAddress(TextField domainAddress) {
                this.domainAddress = domainAddress;
        }


}