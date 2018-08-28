package de.mkaminski.freakshow.model;

import javafx.stage.Stage;

/**
 *
 *Model f�r die Programm-Laufzeut-Speicherung
 *
 */
public class DataModel {

        private Stage stage;

        /**
         *
         *Konstruktor f�r die DataModelKlasse
         *
         *@param stage Stage die bei Start aufgerufen wird.
         */
        public DataModel(Stage stage){

                this.stage = stage;
        }

        /**
         *
         *Getter f�r die Stage die hier global gespeichert wurde.
         *
         */
        public final Stage getPrimaryStage(){

                return this.stage;
        }
}
