package de.mkaminski.freakshow.service;

import de.mkaminski.freakshow.model.ViewModel;


/**
 *
 *Die Klasse ViewChanger ist ein Service, der die Ausgabe nach der Verarbeitung ver�ndert.<br>
 *
 */
public class ViewChanger {

	/**
	 *
	 * Methode, die wichtige Parameter nach der verarbeitung ver�ndernt und das ausgabefeld mit der Ausgabe bef�llt.
	 * Die neue Ansicht ist danach im Programm zu sehen.
	 *
	 */
	public void changeGui(ViewModel viewModel, String result){


		viewModel.getResult().setDisable(false);
		viewModel.getResult().clear();
		viewModel.getResult().appendText(result);
		viewModel.getDomainAddress().clear();

	}


}
