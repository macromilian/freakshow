package de.mkaminski.freakshow.controller;

import de.mkaminski.freakshow.view.Menue;
import de.mkaminski.freakshow.controller.CheckController;
import de.mkaminski.freakshow.controller.CopyController;
import de.mkaminski.freakshow.controller.InfoController;
import de.mkaminski.freakshow.model.DataModel;

/**
 *Controller f�r das Anzeigen der UI f�r den Benutzer. Speichert Daten und
 *Setzt die Parameter f�r die Buttons und Labels bei denen etwas nach einer "Aktion" passieren soll.
 *
 */
public class ViewController {

        private DataModel dataModel;

        private Menue eingabeV;


        /**
         *Konstruktor der Klasse ViewController.<br>
         *Setzt unteranderem die SetOnAction Funktionen f�r "�berpr�fen"-Button, "Kopieren"-Button, etc.
         *
         *@param dataModel DataModel f�r die show()-Methode.
         */
        public ViewController (DataModel dataModel){
                this.dataModel = dataModel;
                this.eingabeV = new Menue();

//                eingabeV.getCheckButton().setOnAction(new CheckController(eingabeV));
//                eingabeV.getDomainAddress().setOnAction(new CheckController(eingabeV));
//                eingabeV.getCopyButton().setOnAction(new CopyController(eingabeV));
//                eingabeV.getInfoLabel().setOnMouseEntered(new InfoController(eingabeV));
                
        }

        /**
         * Show()-Methode die �ber 2 Instanzen die View Anzeigt.
         *
         */
        public void show(){
           eingabeV.show(dataModel.getPrimaryStage());
           
        }
}