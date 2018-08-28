package de.mkaminski.freakshow.service;

import de.mkaminski.freakshow.model.ViewModel;
import de.mkaminski.freakshow.view.Menue;


/**
*
*Die Klasse ModelConverter ist ein Service, der Informationen aus der GUI in ein ViewModel speichert.<br>
* Dies ist notwendig,da bei dem MVC-Paradigma UI und Businesslogik klar getrennt werden.
*
*/
public class ModelConverter {

	/**
	 *
	 * Methode die Viewinformationen in einem ViewModelobjekt speichert.
	 * Sie gibt am Ende das ViewModel zurück.
	 *
	 * @param eingabeView View die konvertiert werden soll
	 * @return ViewModel zum weiteren Arbeiten
	 *
	 */
	public final ViewModel convertModel(Menue menue) {

		ViewModel vModel = new ViewModel();

		vModel.setDomainAddress(menue.getDomainAddress());
		vModel.setResult(menue.getResult());
		vModel.setInfoLabel(menue.getInfoLabel());

		return vModel;

	}

}
